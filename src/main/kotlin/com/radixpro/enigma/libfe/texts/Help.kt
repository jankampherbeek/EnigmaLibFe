/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.texts

import com.radixpro.enigma.libfe.fxbuilders.ButtonBarBuilder
import com.radixpro.enigma.libfe.fxbuilders.ButtonBuilder
import com.radixpro.enigma.libfe.fxbuilders.LabelBuilder
import com.radixpro.enigma.libfe.fxbuilders.PaneBuilder
import com.radixpro.enigma.libfe.helpers.Dictionary.baseStyleSheet
import com.radixpro.enigma.libfe.texts.Rosetta.getText
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.ButtonBar
import javafx.scene.layout.BorderPane
import javafx.scene.layout.Pane
import javafx.scene.web.WebView
import javafx.stage.Modality
import javafx.stage.Stage


/**
 * Display of help text. Handles all help texts.
 */
class Help(private val title: String, private val content: String) {

    private val stage = Stage()

    private fun showContent() {
        stage.width = OUTER_WIDTH
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.title = getText("help.title")
        val buttonBar = createButtonBar()
        val titlePane = createTitlePane()
        val contentPane = createContentPane()
        BorderPane.setAlignment(titlePane, Pos.CENTER)
        BorderPane.setAlignment(contentPane, Pos.CENTER)
        BorderPane.setAlignment(buttonBar, Pos.CENTER)
        val borderPane = BorderPane()
        borderPane.prefWidth = OUTER_WIDTH
        borderPane.padding = Insets(GAP, GAP, GAP, GAP)
        borderPane.stylesheets.add(baseStyleSheet)
        borderPane.styleClass.add("helppane")
        borderPane.top = titlePane
        borderPane.center = contentPane
        borderPane.bottom = buttonBar
        stage.scene = Scene(borderPane)
        stage.show()
    }

    private fun onClose() {
        stage.close()
    }

    private fun createTitlePane(): Pane {
        val lblTitle = LabelBuilder().setText(title).setPrefWidth(INNER_WIDTH).setStyleClass("titletext").build()
        return PaneBuilder().setPrefHeight(TITLE_HEIGHT).setPrefWidth(INNER_WIDTH).setStyleClass("titlepane")
            .setChildren(arrayListOf(lblTitle)).build()
    }

    private fun createContentPane(): Pane {
        return PaneBuilder().setPrefWidth(INNER_WIDTH).setPrefHeight(400.0)
            .setChildren(arrayListOf(createContentWebView())).build()
    }

    private fun createButtonBar(): ButtonBar {
        val buttonBar = ButtonBarBuilder().setButtons(arrayListOf(createCloseButton())).build()
        buttonBar.styleClass.add("helppane")
        return buttonBar
    }

    private fun createContentWebView(): WebView {
        val webView = WebView()
        val webEngine = webView.engine
        val fullContent = PREFIX + content + POSTFIX
        webView.prefWidth = INNER_WIDTH - 12
        webEngine.loadContent(fullContent, "text/html")
        return webView
    }

    private fun createCloseButton(): Button {
        val button = ButtonBuilder().setText("ui.shared.btn.exit").setDisabled(false).build()
        button.setOnAction { onClose() }
        return button
    }

    companion object {
        private const val GAP = 6.0
        private const val INNER_WIDTH = 560.0
        private const val OUTER_WIDTH = 572.0
        private const val TITLE_HEIGHT = 40.0
        private const val PREFIX =
            "<div style=\"font-family: sans-serif, Arial; font-size: 12px; background-color: white;\">"
        private const val POSTFIX = "</div>"
    }

    init {
        showContent()
    }
}