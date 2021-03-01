package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Puppy

@Composable
fun PuppyDetail(puppy: Puppy, onAdopt: (Puppy) -> Unit = {}) {
    Column(
        Modifier.fillMaxSize().background(MaterialTheme.colors.secondary)
    ) {
        Box {
            Image(
                painterResource(puppy.picture),
                "puppy picture: ${puppy.name}",
                Modifier.height(150.dp).fillMaxWidth(),
                contentScale = ContentScale.Inside
            )
        }
        Column(Modifier.padding(16.dp, 10.dp)) {
            Text(puppy.name, style = MaterialTheme.typography.h4)
            Text(puppy.desc, Modifier.padding(bottom = 10.dp), style = MaterialTheme.typography.h6)
            ProvideTextStyle(MaterialTheme.typography.body1) {
                Text("Age: ${puppy.age}")
                Text("Gender: ${puppy.gender}")
                Text("Size: ${puppy.size}")
                Text("Location: ${puppy.location}")
            }
        }
        Button(
            { onAdopt(puppy) },
            Modifier.padding(20.dp).align(Alignment.CenterHorizontally),
        ) {
            Text(text = "Adopt It!")
        }
    }
}

@Preview
@Composable
fun PuppyDetailPreview() {
    PuppyDetail(
        Puppy(
            "Lily", "A dog", "Young",
            "Adult", "Female", R.drawable.img_puppy_storm, "Sunnyvale, CA"
        )
    )
}
