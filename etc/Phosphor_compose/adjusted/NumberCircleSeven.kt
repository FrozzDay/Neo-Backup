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

val Phosphor.NumberCircleSeven: ImageVector
    get() {
        if (_number_circle_seven != null) {
            return _number_circle_seven!!
        }
        _number_circle_seven = Builder(
            name = "Number-circle-seven",
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
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(158.5f, 79.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 1.1f, 7.2f)
                lineToRelative(-32.0f, 96.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 120.0f, 188.0f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -2.5f, -0.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.1f, -10.1f)
                lineTo(140.9f, 92.0f)
                lineTo(104.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 158.5f, 79.3f)
                close()
            }
        }
            .build()
        return _number_circle_seven!!
    }

private var _number_circle_seven: ImageVector? = null



@Preview
@Composable
fun NumberCircleSevenPreview() {
    Image(
        Phosphor.NumberCircleSeven,
        null
    )
}
