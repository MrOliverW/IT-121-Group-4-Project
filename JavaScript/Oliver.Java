const audioPlayer = document.getElementById("myAudio");
const openPopupButton = document.getElementById("openPopup");
const popup = document.getElementById("popup");
const closePopupButton = document.getElementById("closePopup");

openPopupButton.addEventListener("click", () => {
    popup.style.display = "block";
});

closePopupButton.addEventListener("click", () => {
    popup.style.display = "none";
});

// Optional: Play audio when popup opens
popup.addEventListener("show", () => {
    audioPlayer.play();
});
