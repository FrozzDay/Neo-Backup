package com.machiav3lli.backup.ui.compose.icons.phosphor

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

val Phosphor.`Shield-warning`: ImageVector
    get() {
        if (`_shield-warning` != null) {
            return `_shield-warning`!!
        }
        `_shield-warning` = Builder(
            name = "Shield-warning", defaultWidth = 256.0.dp, defaultHeight
            = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(208.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 89.4f, 75.8f, 119.1f, 91.0f, 124.1f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 10.0f, 0.0f)
                curveToRelative(15.2f, -5.0f, 91.0f, -34.7f, 91.0f, -124.1f)
                lineTo(224.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(208.0f, 114.7f)
                curveToRelative(0.0f, 78.2f, -66.4f, 104.4f, -80.0f, 108.9f)
                curveToRelative(-13.5f, -4.5f, -80.0f, -30.6f, -80.0f, -108.9f)
                lineTo(48.0f, 56.0f)
                lineTo(208.0f, 56.0f)
                close()
                moveTo(120.0f, 136.0f)
                lineTo(120.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(119.5f, 180.5f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 116.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 119.5f, 180.5f)
                close()
            }
        }
            .build()
        return `_shield-warning`!!
    }

private var `_shield-warning`: ImageVector? = null
