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

val Phosphor.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = Builder(
            name = "Warning", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
            viewportWidth = 256.0f, viewportHeight = 256.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(120.0f, 144.0f)
                lineTo(120.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(236.8f, 212.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 216.0f, 224.0f)
                lineTo(40.0f, 224.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, -20.7f, -36.0f)
                lineTo(107.2f, 36.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 41.6f, 0.0f)
                lineToRelative(87.9f, 152.0f)
                arcTo(23.7f, 23.7f, 0.0f, false, true, 236.8f, 212.0f)
                close()
                moveTo(222.9f, 196.0f)
                lineTo(134.9f, 44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.8f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-88.0f, 152.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.9f, 4.0f)
                lineTo(216.0f, 208.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.9f, -4.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 222.9f, 196.0f)
                close()
                moveTo(128.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 168.0f)
                close()
            }
        }
            .build()
        return _warning!!
    }

private var _warning: ImageVector? = null
