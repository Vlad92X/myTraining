import 'package:provider/provider.dart';
import 'package:vladfit_test/domain/user.dart';
import 'package:vladfit_test/screens/auth.dart';
import 'package:vladfit_test/screens/home.dart';
import 'package:flutter/material.dart';

class LandingPage extends StatelessWidget {
  const LandingPage({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final User user = Provider.of<User>(context);
    final bool isLoggedIn = user != null;

    return isLoggedIn ? HomePage() : AuthorizationPage();
  }
}
