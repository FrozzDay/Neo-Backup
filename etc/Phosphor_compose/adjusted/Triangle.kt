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

val Phosphor.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(
            name = "Triangle",
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
                moveTo(216.0f, 224.0f)
                horizontalLineTo(40.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, -20.7f, -36.0f)
                lineTo(107.2f, 36.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 41.6f, 0.0f)
                lineToRelative(87.9f, 152.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 216.0f, 224.0f)
                close()
                moveTo(121.1f, 44.0f)
                lineToRelative(-88.0f, 152.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.9f, 4.0f)
                horizontalLineTo(216.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.9f, -4.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 0.0f, -8.0f)
                lineToRelative(-88.0f, -152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.8f, 0.0f)
                close()
            }
        }
            .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null



@Preview
@Composable
fun TrianglePreview() {
    Image(
        Phosphor.Triangle,
        null
    )
}
