package com.chrynan.chords.graphics

import com.chrynan.chords.util.Color
import org.w3c.dom.*

/**
 * A convenience class that holds information about how to draw on a [HTMLCanvasElement].
 *
 * @author chRyNaN
 */
data class Paint(
        var style: Style = Style.FILL,
        var fillColor: Color = Color.BLACK,
        var strokeColor: Color = Color.BLACK,
        var textAlign: Align = Align.CENTER,
        var textSize: Double = 0.0,
        var fontName: String = "",
        var fillRule: FillRule = FillRule.EVEN_ODD,
        var strokeWidth: Double = 0.0,
        var strokeCap: Cap = Cap.BUTT
) {

    val font: String
        get() = "${textSize}px $fontName"

    val isFill: Boolean
        get() = (style == Style.FILL) or (style == Style.FILL_AND_STROKE)

    val isStroke: Boolean
        get() = (style == Style.STROKE) or (style == Style.FILL_AND_STROKE)

    enum class Style {
        FILL,
        STROKE,
        FILL_AND_STROKE
    }

    enum class Align(val canvasTextAlign: CanvasTextAlign) {

        START(canvasTextAlign = CanvasTextAlign.START),
        END(canvasTextAlign = CanvasTextAlign.END),
        LEFT(canvasTextAlign = CanvasTextAlign.LEFT),
        RIGHT(canvasTextAlign = CanvasTextAlign.RIGHT),
        CENTER(canvasTextAlign = CanvasTextAlign.CENTER)
    }

    enum class Cap(val canvasLineCap: CanvasLineCap) {

        BUTT(canvasLineCap = CanvasLineCap.BUTT),
        ROUND(canvasLineCap = CanvasLineCap.ROUND),
        SQUARE(canvasLineCap = CanvasLineCap.SQUARE)
    }

    enum class FillRule(val canvasFillRule: CanvasFillRule) {

        EVEN_ODD(canvasFillRule = CanvasFillRule.EVENODD),
        NON_ZERO(canvasFillRule = CanvasFillRule.NONZERO)
    }
}