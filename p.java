function matchVolunteer(donationLocation, expiryTime) {
  let radius = 2; // initial 2km
  let potentialVolunteers = findVolunteers(donationLocation, radius);
  
  if (potentialVolunteers.length == 0) {
    // Wait and expand radius
    setTimeout(() => { expandRadius(5); }, 600000); 
  }
  
  notify(potentialVolunteers, "Fresh Food Ready for Pickup!");
}