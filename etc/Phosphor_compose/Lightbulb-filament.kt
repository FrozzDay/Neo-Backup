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

val Phosphor.`Lightbulb-filament`: ImageVector
    get() {
        if (`_lightbulb-filament` != null) {
            return `_lightbulb-filament`!!
        }
        `_lightbulb-filament` = Builder(
            name = "Lightbulb-filament", defaultWidth = 256.0.dp,
            defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(176.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(88.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 232.0f)
                close()
                moveTo(216.0f, 104.0f)
                arcToRelative(87.7f, 87.7f, 0.0f, false, true, -33.6f, 69.2f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 176.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(96.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -6.2f, -12.7f)
                arcTo(87.8f, 87.8f, 0.0f, false, true, 40.0f, 104.5f)
                curveTo(39.7f, 56.8f, 78.3f, 17.1f, 125.9f, 16.0f)
                arcTo(87.9f, 87.9f, 0.0f, false, true, 216.0f, 104.0f)
                close()
                moveTo(200.0f, 104.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, false, -73.7f, -72.0f)
                curveToRelative(-39.0f, 0.9f, -70.5f, 33.4f, -70.3f, 72.4f)
                arcToRelative(71.7f, 71.7f, 0.0f, false, false, 27.6f, 56.3f)
                horizontalLineToRelative(0.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 186.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(24.0f)
                lineTo(120.0f, 147.3f)
                lineTo(90.3f, 117.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(128.0f, 132.7f)
                lineToRelative(26.3f, -26.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                lineTo(136.0f, 147.3f)
                lineTo(136.0f, 192.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 12.5f, -25.4f)
                arcTo(71.5f, 71.5f, 0.0f, false, false, 200.0f, 104.0f)
                close()
            }
        }
            .build()
        return `_lightbulb-filament`!!
    }

private var `_lightbulb-filament`: ImageVector? = null
