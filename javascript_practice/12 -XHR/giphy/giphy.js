'use strict';

let httpRequest = new XMLHttpRequest();
let img = document.querySelector('img');
let randomButton = document.querySelector('button');

let getRandomImage = function(){
  httpRequest.open('GET', 'http://api.giphy.com/v1/gifs/random?tag=rick+morty+rick-and-morty&api_key=eb56f93106b0410b81efd2215907147a&limit=1', true);
  httpRequest.send();
  img.src = 'adasszunet.jpg';
};

httpRequest.onreadystatechange = function() {
  if(httpRequest.readyState === 4 && httpRequest.status === 200) {
    let response = JSON.parse(httpRequest.response);
    let data = response.data;
    console.log(response);
    img.src = data.image_url;
  }
};

getRandomImage();
randomButton.addEventListener('click', function() {
  getRandomImage();
  console.log('click');
});
