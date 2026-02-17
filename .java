import React from 'react';
import { StyleSheet, Text, View, TouchableOpacity, Image } from 'react-native';

export default function FreshFirstApp() {
  return (
    <View style={styles.container}>
      {/* Header */}
      <View style={styles.header}>
        <Text style={styles.logo}>THE FRESH FIRST</Text>
        <Text style={styles.tagline}>No one sleeps hungry tonight.</Text>
      </View>

      {/* Hero Image / Map Placeholder */}
      <View style={styles.mapPlaceholder}>
        <Text style={{color: '#666'}}>Live Hunger Map Loading...</Text>
      </View>

      {/* Main Actions */}
      <View style={styles.buttonContainer}>
        <TouchableOpacity style={styles.findButton}>
          <Text style={styles.buttonText}>Find Free Food Near Me</Text>
        </TouchableOpacity>

        <TouchableOpacity style={styles.donateButton}>
          <Text style={styles.buttonText}>Temple/Restaurant: Donate Now</Text>
        </TouchableOpacity>
      </View>

      {/* Status Bar */}
      <View style={styles.stats}>
        <Text>Active Meals Today: 1,240</Text>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: '#f9f9f9', padding: 20 },
  header: { marginTop: 50, alignItems: 'center' },
  logo: { fontSize: 28, fontWeight: 'bold', color: '#2D5A27' },
  tagline: { fontSize: 14, color: '#555' },
  mapPlaceholder: { height: 300, backgroundColor: '#e0e0e0', marginTop: 20, borderRadius: 15, justifyContent: 'center', alignItems: 'center' },
  buttonContainer: { marginTop: 30 },
  findButton: { backgroundColor: '#FF9800', padding: 20, borderRadius: 10, marginBottom: 15, alignItems: 'center' },
  donateButton: { backgroundColor: '#2D5A27', padding: 20, borderRadius: 10, alignItems: 'center' },
  buttonText: { color: '#fff', fontWeight: 'bold', fontSize: 16 },
  stats: { marginTop: 20, alignItems: 'center' }
});