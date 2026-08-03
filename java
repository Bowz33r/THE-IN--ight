const BTC_WALLET = "1LLrDALnEcKsvWp67fb3uU7BSFeFjpx7xV";

const influencers = [
  { name: "Luna Virelle", img: "https://picsum.photos/300/400?random=1" },
  { name: "Zara Nyx", img: "https://picsum.photos/300/400?random=2" },
  { name: "Elara Voss", img: "https://picsum.photos/300/400?random=3" },
  { name: "Nyomi Kade", img: "https://picsum.photos/300/400?random=4" },
  { name: "Sienna Vale", img: "https://picsum.photos/300/400?random=5" },
  { name: "Aria Solene", img: "https://picsum.photos/300/400?random=6" }
];

const carousel = document.getElementById("carousel");

influencers.forEach(influencer => {
  const card = document.createElement("div");
  card.className = "card";

  card.innerHTML = `
    <img src="${influencer.img}" alt="${influencer.name}">
    <h3>${influencer.name}</h3>
    <button onclick="unlock('${influencer.name}')">Unlock ($80/year)</button>
  `;

  carousel.appendChild(card);
});

function scrollCarousel(direction) {
  carousel.scrollBy({
    left: direction * 300,
    behavior: 'smooth'
  });
}

function subscribe() {
  alert(
    "Subscribe for $80/year.\n\n" +
    "Send Bitcoin to:\n" +
    BTC_WALLET +
    "\n\nAfter payment, access will be granted."
  );
}

function unlock(name) {
  alert(
    `Unlock ${name} for $80/year.\n\n` +
    "Send Bitcoin to:\n" +
    BTC_WALLET +
    "\n\nInclude your username as reference."
  );
}
