package com.abaferas.yajhz.ui.modifiers

import android.graphics.BlurMaskFilter
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.abaferas.yajhz.ui.theme.color_black

fun Modifier.innerShadow(
    shape: Shape,
    color: Color = color_black,
    blur: Dp = 16.dp,
    offsetY: Dp = 1.dp,
    offsetX: Dp = 1.dp,
    spread: Dp = 1.dp
) = drawWithContent {

    drawContent()

    val rect = Rect(Offset.Zero, size)
    val paint = Paint().apply {
        this.color = color
        this.isAntiAlias = true
    }

    val shadowOutline = shape.createOutline(size, layoutDirection, this)

    drawIntoCanvas { canvas ->

        canvas.saveLayer(rect, paint)
        canvas.drawOutline(shadowOutline, paint)

        val frameworkPaint = paint.asFrameworkPaint()
        frameworkPaint.xfermode = PorterDuffXfermode(PorterDuff.Mode.DST_OUT)

        if (blur.toPx() > 0) {
            frameworkPaint.maskFilter = BlurMaskFilter(blur.toPx(), BlurMaskFilter.Blur.NORMAL)
        }

        paint.color = Color.Black

        val spreadOffsetX = offsetX.toPx() + if (offsetX.toPx() < 0) -spread.toPx() else spread.toPx()
        val spreadOffsetY = offsetY.toPx() + if (offsetY.toPx() < 0) -spread.toPx() else spread.toPx()

        canvas.translate(spreadOffsetX, spreadOffsetY)
        canvas.drawOutline(shadowOutline, paint)
        canvas.restore()
    }
}