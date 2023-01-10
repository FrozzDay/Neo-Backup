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

val Phosphor.CurrencyJpy: ImageVector
    get() {
        if (_currency_jpy != null) {
            return _currency_jpy!!
        }
        _currency_jpy = Builder(
            name = "Currency-jpy",
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
                moveTo(206.2f, 53.1f)
                lineTo(144.9f, 128.0f)
                horizontalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(176.0f)
                horizontalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                verticalLineTo(144.0f)
                horizontalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(31.1f)
                lineTo(49.8f, 53.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 62.2f, 42.9f)
                lineTo(128.0f, 123.4f)
                lineToRelative(65.8f, -80.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.4f, 10.2f)
                close()
            }
        }
            .build()
        return _currency_jpy!!
    }

private var _currency_jpy: ImageVector? = null



@Preview
@Composable
fun CurrencyJpyPreview() {
    Image(
        Phosphor.CurrencyJpy,
        null
    )
}
