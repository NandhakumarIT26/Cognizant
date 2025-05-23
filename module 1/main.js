// 1. Basic Setup
console.log("Welcome to the Community Portal");
window.onload = () => {
  alert("Page fully loaded");
  const savedType = localStorage.getItem("eventType");
  if (savedType) {
    document.getElementById("eventType").value = savedType;
    showFee();
  }
};

// 2. Event Type Fee Display
function showFee() {
  const type = document.getElementById("eventType").value;
  localStorage.setItem("eventType", type);
  const fees = {
    music: "$10",
    food: "$5",
    sports: "$8"
  };
  document.getElementById("feeDisplay").textContent = "Fee: " + fees[type];
}

// 3. Phone Validation
function validatePhone() {
  const phone = document.getElementById("phone");
  if (!/^\d{10}$/.test(phone.value)) {
    alert("Please enter a 10-digit phone number");
    phone.focus();
  }
}

// 4. Image Enlargement
function enlargeImage(img) {
  img.style.transform = "scale(1.5)";
  img.style.transition = "transform 0.3s";
}

// 5. Feedback Character Counter
function countChars() {
  const count = document.getElementById("feedback").value.length;
  document.getElementById("charCount").textContent = `${count} characters`;
}

// 6. Video Ready Notification
function videoReady() {
  document.getElementById("videoStatus").textContent = "Video ready to play";
}

// 7. Before Unload Warning
window.onbeforeunload = () => {
  return "You have unsaved changes. Are you sure you want to leave?";
};

// 8. Location Finder
function findLocation() {
  if (!navigator.geolocation) {
    return alert("Geolocation is not supported by this browser.");
  }

  navigator.geolocation.getCurrentPosition(
    (position) => {
      const { latitude, longitude } = position.coords;
      document.getElementById("location").textContent = `Latitude: ${latitude}, Longitude: ${longitude}`;
    },
    (error) => alert("Geolocation error: " + error.message),
    { enableHighAccuracy: true, timeout: 5000 }
  );
}

// 9. Clear Preferences
function clearPreferences() {
  localStorage.clear();
  sessionStorage.clear();
  alert("Preferences cleared.");
}

// 10. Form Submission
function confirmSubmit(event) {
  event.preventDefault();
  document.getElementById("confirmation").value = "Thank you for registering!";
  return false;
}
// Sample event data
const events = [
  {
    name: "Music Fest",
    image: "event1.jpg",
    date: "2025-06-15",
    category: "music",
    description: "Live performances from local bands.",
    seats: 50
  },
  {
    name: "Food Carnival",
    image: "event2.jpg",
    date: "2025-07-01",
    category: "food",
    description: "Taste dishes from around the world.",
    seats: 0
  },
  {
    name: "Sports Meet",
    image: "event3.jpg",
    date: "2025-06-25",
    category: "sports",
    description: "Track and field events for all ages.",
    seats: 12
  }
];

// Render events dynamically
function renderEvents() {
  const container = document.getElementById("eventGrid");
  container.innerHTML = ""; // Clear any existing content

  events.forEach(event => {
    // Only show future events with available seats
    const isFuture = new Date(event.date) > new Date();
    if (isFuture && event.seats > 0) {
      const card = document.createElement("div");
      card.className = "event-card";
      card.innerHTML = `
        <img src="${event.image}" alt="${event.name}">
        <h3>${event.name}</h3>
        <p>${event.description}</p>
        <p><strong>Date:</strong> ${event.date}</p>
        <p><strong>Seats:</strong> ${event.seats}</p>
      `;
      container.appendChild(card);
    }
  });
}

// Call render function on page load
window.onload = () => {
  alert("Page fully loaded");
  renderEvents(); // Show events
  const savedType = localStorage.getItem("eventType");
  if (savedType) {
    document.getElementById("eventType").value = savedType;
    showFee();
  }
};
