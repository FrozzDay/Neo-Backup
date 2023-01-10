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

val Phosphor.BezierCurve: ImageVector
    get() {
        if (_bezier_curve != null) {
            return _bezier_curve!!
        }
        _bezier_curve = Builder(
            name = "Bezier-curve",
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
                moveTo(221.1f, 144.4f)
                arcTo(97.0f, 97.0f, 0.0f, false, false, 181.0f, 88.0f)
                horizontalLineToRelative(59.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(159.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -62.0f, 0.0f)
                lineTo(16.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(75.0f, 88.0f)
                arcToRelative(97.0f, 97.0f, 0.0f, false, false, -40.1f, 56.4f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 51.1f, 146.0f)
                arcTo(80.5f, 80.5f, 0.0f, false, true, 99.0f, 93.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 58.0f, 0.0f)
                arcTo(80.5f, 80.5f, 0.0f, false, true, 204.9f, 146.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 16.2f, -1.6f)
                close()
                moveTo(56.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 176.0f)
                close()
                moveTo(128.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 96.0f)
                close()
                moveTo(216.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 192.0f)
                close()
            }
        }
            .build()
        return _bezier_curve!!
    }

private var _bezier_curve: ImageVector? = null



@Preview
@Composable
fun BezierCurvePreview() {
    Image(
        Phosphor.BezierCurve,
        null
    )
}
