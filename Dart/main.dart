class Vehicale {
  String manufacturer;
  double fuelCapacity;
  double fuelRemaining;

  String showInfo() => '$manufacturer: $fuelRemaining of $fuelCapacity';
}

void main(List<String> args) {
  var vehicle = Vehicale()
    ..manufacturer = 'BMW'
    ..fuelCapacity = 60
    ..fuelRemaining = 30;

  print(vehicle.showInfo());
}
