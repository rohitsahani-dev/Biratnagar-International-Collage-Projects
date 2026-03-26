const apiKey = "87dc1320"; 

const btnSearch = document.getElementById("searchBtn");
const inputMovie = document.getElementById("movieInput");
const resultArea = document.getElementById("movieResult");
const errorText = document.getElementById("errorMessage");

btnSearch.addEventListener("click", fetchMovieData);

async function fetchMovieData() {
  const movieTitle = inputMovie.value.trim();

  if (movieTitle === "") {
    errorText.textContent = "You have not entered any movie";
    resultArea.innerHTML = "";
    return;
  }

  errorText.textContent = "";
  resultArea.innerHTML = "Loading...";

  try {
    const apiResponse = await fetch(
      `https://www.omdbapi.com/?t=${movieTitle}&apikey=${apiKey}`
    );

    const movieData = await apiResponse.json();

    if (movieData.Response === "False") {
      throw new Error(movieData.Error);
    }

    showMovie(movieData);

  } catch (err) {
    resultArea.innerHTML = "";
    errorText.textContent = err.message;
  }
}

function showMovie(data) {
  resultArea.innerHTML = `
    <h2>${data.Title}</h2>
    <img src="${data.Poster !== "N/A" ? data.Poster : ""}">
    <p><b>Year:</b> ${data.Year}</p>
    <p><b>Genre:</b> ${data.Genre}</p>
    <p><b>Plot:</b> ${data.Plot}</p>
  `;
}
