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

val Phosphor.CloudCheck: ImageVector
    get() {
        if (_cloud_check != null) {
            return _cloud_check!!
        }
        _cloud_check = Builder(
            name = "Cloud-check",
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
                moveTo(160.0f, 40.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 81.3f, 88.7f)
                arcTo(58.2f, 58.2f, 0.0f, false, false, 72.0f, 88.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, 128.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 0.0f, -176.0f)
                close()
                moveTo(160.0f, 200.0f)
                lineTo(72.0f, 200.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, -96.0f)
                horizontalLineToRelative(3.3f)
                arcTo(85.7f, 85.7f, 0.0f, false, false, 72.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 72.0f, 72.0f)
                close()
                moveTo(197.7f, 110.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(144.0f, 152.7f)
                lineToRelative(42.3f, -42.4f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 197.7f, 110.3f)
                close()
            }
        }
            .build()
        return _cloud_check!!
    }

private var _cloud_check: ImageVector? = null



@Preview
@Composable
fun CloudCheckPreview() {
    Image(
        Phosphor.CloudCheck,
        null
    )
}
