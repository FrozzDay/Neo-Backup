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

val Phosphor.FishSimple: ImageVector
    get() {
        if (_fish_simple != null) {
            return _fish_simple!!
        }
        _fish_simple = Builder(
            name = "Fish-simple",
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
                moveTo(168.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 76.0f)
                close()
                moveTo(198.2f, 168.0f)
                curveToRelative(-26.5f, 26.4f, -68.4f, 37.4f, -125.1f, 32.9f)
                curveToRelative(1.6f, 11.8f, 3.8f, 24.3f, 6.7f, 37.4f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.1f, 9.5f)
                lineTo(72.0f, 248.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, -6.3f)
                curveToRelative(-3.3f, -14.9f, -5.7f, -29.1f, -7.4f, -42.5f)
                curveToRelative(-13.4f, -1.7f, -27.6f, -4.2f, -42.5f, -7.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.4f, -15.7f)
                curveToRelative(13.1f, 2.9f, 25.6f, 5.2f, 37.4f, 6.8f)
                curveTo(50.6f, 126.2f, 61.6f, 84.3f, 88.0f, 57.8f)
                curveToRelative(41.0f, -41.0f, 105.8f, -30.9f, 124.7f, -26.8f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 225.0f, 43.3f)
                curveTo(229.1f, 62.2f, 239.2f, 127.0f, 198.2f, 168.0f)
                close()
                moveTo(184.5f, 158.9f)
                arcToRelative(103.0f, 103.0f, 0.0f, false, true, -58.0f, -29.4f)
                arcTo(103.6f, 103.6f, 0.0f, false, true, 97.1f, 71.4f)
                curveTo(75.3f, 95.2f, 66.6f, 133.1f, 71.3f, 184.7f)
                curveTo(122.8f, 189.4f, 160.8f, 180.7f, 184.5f, 158.9f)
                close()
                moveTo(209.4f, 46.7f)
                curveToRelative(-15.0f, -3.3f, -62.3f, -10.9f, -97.3f, 12.1f)
                arcToRelative(87.9f, 87.9f, 0.0f, false, false, 85.1f, 85.1f)
                curveTo(220.2f, 108.9f, 212.6f, 61.6f, 209.4f, 46.7f)
                close()
            }
        }
            .build()
        return _fish_simple!!
    }

private var _fish_simple: ImageVector? = null



@Preview
@Composable
fun FishSimplePreview() {
    Image(
        Phosphor.FishSimple,
        null
    )
}
