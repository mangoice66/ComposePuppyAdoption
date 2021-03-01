/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Puppy

class MainViewModel : ViewModel() {
    val puppyList by mutableStateOf(
        listOf(
            Puppy(
                "Butch", "Butch has had a horrible start to his short life. " +
                    "He was found in Mexico with his throat cut from his neck all the way to his chest. ",
                "Young", "Male", "Small", R.drawable.img_puppy_butch, "Los Angeles, CA"
            ),
            Puppy(
                "Storm", "Storm is an absolute dream dog in need of his forever home." +
                    "He is loving, great with people and great with dogs.", "Adult", "Male",
                "Large", R.drawable.img_puppy_storm, "Los Angeles, CA"
            ),
            Puppy(
                "Freddie", "Freddie is an amazingly sweet" +
                    ", energetic and happy boy who is around 1 years old and is looking for his forever home!",
                "Young", "Male", "Large", R.drawable.img_puppy_freddie, "Los Angeles, CA"
            ),
            Puppy(
                "Bora", "Bora is a 2 year old Shepherd mix looking for her forever home! " +
                    "She was found in Mexico with her litter of puppies.", "Adult", "Female",
                "Medium", R.drawable.img_puppy_bora, "Los Angeles, CA"
            ),
            Puppy(
                "JoJo", "This is very affectionate young female a red heeler. " +
                    "She got to our rescue via neighbours who rescued her from the owner who was neglecting her.",
                "Adult", "Female", "Medium", R.drawable.img_puppy_jojo, "Los Angeles, CA"
            ),
            Puppy(
                "Rosie", "You can fill out an adoption application online on our official website.Sweet as Apple Pie!" +
                    "Rosie is a 12 pound, 15 year old Chihuahua mix.", "Senior", "Female",
                "Senior", R.drawable.img_puppy_rosie, "Los Angeles, CA"
            ),
            Puppy(
                "Finn", "Finn is super smart and fun. He is high energy and very athletic." +
                    "He would excel at a job or sport that would challenge him.", "Adult",
                "Male", "Medium", R.drawable.img_puppy_finn, "Santa Clara, CA"
            ),
            Puppy(
                "Cassie", "Cassie is a 1 1/2 year old female cattledog." +
                    " She is fine with other dogs and unknown how she is with cats. ", "Adult",
                "Female", "Medium", R.drawable.img_puppy_cassie, "Santa Clara, CA"
            ),
            Puppy(
                "Tucker", "Tucker is a gorgeous, sweet, and delightful 2 year old male Cattledog," +
                    " who is looking for a family to call his own. ", "Adult", "Male",
                "Medium", R.drawable.img_puppy_tucker, "Santa Clara, CA"
            ),
            Puppy(
                "Sia", "Hi, I'm Sia! I am a young gal with a lot of energy and would " +
                    "thrive in a very active household! Want to go for a hike?", "Young",
                "Female", "Medium", R.drawable.img_puppy_sia, "Santa Clara, CA"
            ),
        )
    )

    var currentPuppy: Puppy? by mutableStateOf(null)

    fun showDetail(puppy: Puppy) {
        currentPuppy = puppy
    }

    fun closeDetail() {
        currentPuppy = null
    }
}