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

val Phosphor.NumberSquareFive: ImageVector
    get() {
        if (_number_square_five != null) {
            return _number_square_five!!
        }
        _number_square_five = Builder(
            name = "Number-square-five",
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
                moveTo(118.6f, 88.0f)
                lineToRelative(-4.1f, 25.2f)
                arcToRelative(37.3f, 37.3f, 0.0f, false, true, 9.4f, -1.2f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -25.5f, 61.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.2f, -11.4f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 14.3f, 5.9f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 14.2f, -5.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, -28.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -14.2f, -5.9f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -14.3f, 5.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.5f, -7.0f)
                lineToRelative(7.8f, -48.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.9f, -6.7f)
                horizontalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(224.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                horizontalLineTo(208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(208.0f, 208.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(208.0f)
                close()
            }
        }
            .build()
        return _number_square_five!!
    }

private var _number_square_five: ImageVector? = null



@Preview
@Composable
fun NumberSquareFivePreview() {
    Image(
        Phosphor.NumberSquareFive,
        null
    )
}
