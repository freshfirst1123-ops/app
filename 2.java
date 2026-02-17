// Function to upload a donation from a Temple/Restaurant
Future<void> donateFood(int quantity, String foodType, int expiryHours) async {
  DateTime expiryDate = DateTime.now().add(Duration(hours: expiryHours));

  await FirebaseFirestore.instance.collection('donations').add({
    'donor_name': 'Shiva Temple',
    'quantity': quantity,
    'type': foodType,
    'status': 'available', // available -> picked_up -> delivered
    'expiry_time': expiryDate,
    'location': GeoPoint(12.9716, 77.5946), // Bangalore example
    'timestamp': FieldValue.serverTimestamp(),
  });
}