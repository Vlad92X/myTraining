import 'package:provider/provider.dart';
import 'package:vladfit_test/domain/user.dart';
import 'package:vladfit_test/screens/auth.dart';
import 'package:vladfit_test/screens/home.dart';
import 'package:vladfit_test/screens/landing.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:vladfit_test/services/auth.dart';
import 'domain/workout.dart';

void main() {
  runApp(MaxFitApp());
}

class MaxFitApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return StreamProvider<User>.value(
      value: AuthService().carrentUser,
      child: MaterialApp(
        title: "Max Fitness",
        theme: ThemeData(
          primaryColor: Color.fromRGBO(50, 65, 85, 1),
          textTheme: TextTheme(
              title: TextStyle(
            color: Colors.white,
          )),
        ),
        home: LandingPage(),
      ),
    );
  }
}
