package com.machiav3lli.backup.ui.compose.icons.phosphor


import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.machiav3lli.backup.ui.compose.icons.Phosphor

val Phosphor.ChartBar: ImageVector
    get() {
        if (_chart_bar != null) {
            return _chart_bar!!
        }
        _chart_bar = Builder(
            name = "Chart-bar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 256.0f,
            viewportHeight = 256.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(228.0f, 200.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(220.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(156.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(148.0f, 80.0f)
                lineTo(100.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(40.0f)
                lineTo(44.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(228.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(108.0f, 96.0f)
                horizontalLineToRelative(40.0f)
                lineTo(148.0f, 200.0f)
                lineTo(108.0f, 200.0f)
                close()
                moveTo(52.0f, 144.0f)
                lineTo(92.0f, 144.0f)
                verticalLineToRelative(56.0f)
                lineTo(52.0f, 200.0f)
                close()
                moveTo(164.0f, 200.0f)
                lineTo(164.0f, 48.0f)
                horizontalLineToRelative(40.0f)
                lineTo(204.0f, 200.0f)
                close()
            }
        }
            .build()
        return _chart_bar!!
    }

private var _chart_bar: ImageVector? = null



@Preview
@Composable
fun ChartBarPreview() {
    Image(
        Phosphor.ChartBar,
        null
    )
}
