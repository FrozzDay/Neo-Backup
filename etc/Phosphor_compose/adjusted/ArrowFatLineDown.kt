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

val Phosphor.ArrowFatLineDown: ImageVector
    get() {
        if (_arrow_fat_line_down != null) {
            return _arrow_fat_line_down!!
        }
        _arrow_fat_line_down = Builder(
            name = "Arrow-fat-line-down",
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
                moveTo(231.4f, 132.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 128.0f)
                horizontalLineTo(184.0f)
                verticalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.4f, 4.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.7f, 8.8f)
                lineToRelative(96.0f, 96.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                arcTo(8.4f, 8.4f, 0.0f, false, false, 231.4f, 132.9f)
                close()
                moveTo(128.0f, 220.7f)
                lineTo(51.3f, 144.0f)
                horizontalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(80.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(28.7f)
                close()
                moveTo(72.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 40.0f)
                close()
            }
        }
            .build()
        return _arrow_fat_line_down!!
    }

private var _arrow_fat_line_down: ImageVector? = null



@Preview
@Composable
fun ArrowFatLineDownPreview() {
    Image(
        Phosphor.ArrowFatLineDown,
        null
    )
}
