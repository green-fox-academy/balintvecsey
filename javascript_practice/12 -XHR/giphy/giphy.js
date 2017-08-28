'use strict';

let httpRequest = new XMLHttpRequest();
httpRequest.open('GET', 'http://api.giphy.com/v1/gifs/random?tag=funny+cute&api_key=eb56f93106b0410b81efd2215907147a&limit=1', true);
httpRequest.send();
httpRequest.onreadystatechange = console.log;
