package com.neorandom.artspace.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.neorandom.artspace.data.model.InfoFooterData

@Composable
fun InfoFooter(modifier: Modifier = Modifier, infoFooterData: InfoFooterData) {
    Surface(
        color = Color(0, 0, 0, 0),
        modifier = modifier
    ) {
        Column(
            modifier = modifier.padding(
                12.dp,
                top = 32.dp,
                bottom = 16.dp
            ),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = infoFooterData.title,
                fontSize = 20.sp,
                fontWeight = FontWeight.W600,
                color = Color.White
            )
            Text(
                text = infoFooterData.description,
                color = Color.White
            )
        }
    }
}
