// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
      ['Challenge ACCEPTED!', 'A lie is just a great story, that someone ruined with the truth', 'i think i am in love with you...WHAT???!', 'Think of me as Yoda, only instead of being little and green, I wear suits and I am awesome. I am your bro. I am Broda'];

  // Pick a random greeting. 
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}

async function fetchRandomNumber() {
  const responseFromServer = await fetch('/random-number');
  const textFromResponse = await responseFromServer.text();
  const numberContainer = document.getElementById('random-number-container');
  numberContainer.innerText = textFromResponse;
}

async function fetchRandomPhrase() {
  const responseFromServer = await fetch('/random-phrase');
  const jsonData = await responseFromServer.json();
  const phraseContainer = document.getElementById('random-phrase-container');
  
  phraseContainer.innerText = jsonData[Math.floor(Math.random() * jsonData.length)]
}

async function fetchMemeFile() {
  const responseFromServer = await fetch('/memes');
  const textFromResponse = await responseFromServer.text();
  const memeContainer = document.getElementById('memes-container');
  memeContainer.innerHTML = textFromResponse;
}
