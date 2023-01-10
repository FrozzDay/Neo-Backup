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

val Phosphor.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(
            name = "Ruler", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
            viewportWidth = 256.0f, viewportHeight = 256.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(232.0f, 76.7f)
                lineTo(179.3f, 24.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(90.3f, 90.3f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-36.0f, 36.0f)
                horizontalLineToRelative(0.0f)
                lineTo(24.0f, 156.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 0.0f, 22.6f)
                lineTo(76.7f, 232.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 22.6f, 0.0f)
                lineTo(232.0f, 99.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 0.0f, -22.6f)
                close()
                moveTo(220.7f, 88.0f)
                horizontalLineToRelative(0.0f)
                lineTo(88.0f, 220.7f)
                lineTo(35.3f, 168.0f)
                lineTo(60.0f, 143.3f)
                lineToRelative(26.3f, 26.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(71.3f, 132.0f)
                lineTo(96.0f, 107.3f)
                lineToRelative(26.3f, 26.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(107.3f, 96.0f)
                lineTo(132.0f, 71.3f)
                lineToRelative(26.3f, 26.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(143.3f, 60.0f)
                lineTo(168.0f, 35.3f)
                lineTo(220.7f, 88.0f)
                close()
            }
        }
            .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
