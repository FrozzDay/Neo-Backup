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

val Phosphor.UserPlus: ImageVector
    get() {
        if (_user_plus != null) {
            return _user_plus!!
        }
        _user_plus = Builder(
            name = "User-plus",
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
                moveTo(256.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(232.0f, 144.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 144.0f)
                lineTo(200.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(216.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 136.0f)
                close()
                moveTo(199.9f, 194.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -1.0f, 11.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -11.2f, -1.0f)
                arcToRelative(104.2f, 104.2f, 0.0f, false, false, -159.4f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.2f, -10.2f)
                arcToRelative(118.4f, 118.4f, 0.0f, false, true, 55.8f, -37.3f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 72.2f, 0.0f)
                arcTo(118.4f, 118.4f, 0.0f, false, true, 199.9f, 194.9f)
                close()
                moveTo(108.0f, 152.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -52.0f, -52.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 108.0f, 152.0f)
                close()
            }
        }
            .build()
        return _user_plus!!
    }

private var _user_plus: ImageVector? = null



@Preview
@Composable
fun UserPlusPreview() {
    Image(
        Phosphor.UserPlus,
        null
    )
}
