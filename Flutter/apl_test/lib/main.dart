import 'package:apl_test/screens/auth.dart';
import 'package:apl_test/screens/home.dart';
import 'package:apl_test/screens/landing.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'domain/workout.dart';

void main() {
  runApp(MaxFitApp());
}

class MaxFitApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Max Fitness",
      theme: ThemeData(
        primaryColor: Color.fromRGBO(50, 65, 85, 1),
        textTheme: TextTheme(
            title: TextStyle(
          color: Colors.white,
        )),
      ),
      home: LandingPage(),
    );
  }
}
