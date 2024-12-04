package com.neorandom.artspace.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DirectionButtons(
    modifier: Modifier = Modifier,
    upButtonOnClick: () -> Unit,
    downButtonOnClick: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(
            space = 10.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.End,
        modifier = modifier
    ) {
        Button(
            onClick = upButtonOnClick,
            contentPadding = PaddingValues(6.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0, 0, 0, 72)),
            modifier = Modifier
                .width(40.dp)
                .height(40.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.KeyboardArrowUp,
                contentDescription = "up",
                modifier = Modifier.fillMaxSize(),
                tint = Color.White
            )
        }

        Button(
            onClick = downButtonOnClick,
            contentPadding = PaddingValues(6.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0, 0, 0, 72)),
            modifier = Modifier
                .width(40.dp)
                .height(40.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.KeyboardArrowDown,
                contentDescription = "down",
                modifier = Modifier.fillMaxSize(),
                tint = Color.White
            )
        }
    }
}