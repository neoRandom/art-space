package com.neorandom.artspace

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.neorandom.artspace.data.model.ArtInfo
import com.neorandom.artspace.ui.components.DirectionButtons
import com.neorandom.artspace.ui.components.InfoFooter
import com.neorandom.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES)
            enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ArtSpace(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ArtSpace(modifier: Modifier = Modifier) {
    var currentID by rememberSaveable { mutableIntStateOf(0) }

    val artInfo = ArtInfo(currentID)

    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(artInfo.imageID),
            contentDescription = "",
            modifier = Modifier.fillMaxSize()
        )
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            DirectionButtons(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                upButtonOnClick = {
                    if (currentID > 0)
                        currentID--
                },
                downButtonOnClick = {
                    if (currentID < ArtInfo.getMaxSize())
                        currentID++
                }
            )

            Box(
                modifier = modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
            ) {
                InfoFooter(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.verticalGradient(
                                colorStops = arrayOf(
                                    0.0f to Color.Transparent,
                                    0.2f to Color(0, 0, 0, 18),
                                    1.0f to Color(0, 0, 0, 72)
                                )
                            )
                        ),
                    infoFooterData = artInfo.infoFooterData
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        ArtSpace()
    }
}