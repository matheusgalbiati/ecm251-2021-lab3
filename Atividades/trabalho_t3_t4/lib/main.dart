import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      //home: const MyHomePage(title: 'Flutter Demo Home Page'),
      home: const HomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({Key? key, required this.title}) : super(key: key);

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      _counter++;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            const Text(
              'You have pushed the button this many times:',
            ),
            Text(
              '$_counter',
              style: Theme.of(context).textTheme.headline4,
            ),
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: _incrementCounter,
        tooltip: 'Increment',
        child: const Icon(Icons.add),
      ),
    );
  }
}

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      drawer: const Drawer(),
      appBar: AppBar(
        title: const Text("Logo"),
        actions: [
          IconButton(
            iconSize: 48.0,
            onPressed: () {},
            icon: const FittedBox(
              fit: BoxFit.contain,
              child: Text(
                "Entrar",
                //style: TextStyle(fontSize: 32.0),
              ),
            ),
          ),
          IconButton(
            iconSize: 82.0,
            onPressed: () {},
            icon: const FittedBox(
              fit: BoxFit.contain,
              child: Text(
                "Criar conta",
                //style: TextStyle(fontSize: 32.0),
              ),
            ),
          ),
        ],
      ),
      body: Material(
        child: Container(
          child: Center(
            child: ListView(
              children: [
                //Container(),
                makeListCards("Topico 1"),
                makeListCards("Topico 2"),
                makeListCards("Topico 3"),
                makeListCards("Topico 4"),
              ],
            ),
          ),
        ),
      ),
    );
  }
}

int counter = 0;

Widget makeListCards(String title) {
  return Container(
    padding: const EdgeInsets.only(left: 5, right: 5),
    height: 220,
    child: Column(
      children: <Widget>[
        Expanded(
          child: Row(
              mainAxisAlignment: MainAxisAlignment.start,
              children: <Widget>[
                Text(title /*, style: topMenuStyle*/),
              ]),
        ),
        Container(
          height: 200,
          child: ListView(
              padding: const EdgeInsets.all(3),
              scrollDirection: Axis.horizontal,
              //shrinkWrap: true,
              children: makeCards()),
        )
      ],
    ),
  );
}

List<Widget> makeCards() {
  List<Container> gameList = [];
  for (int i = 0; i < 6; i++) {
    counter++;
    gameList.add(
      Container(
        child: Column(
          children: [
            Container(
              padding: const EdgeInsets.all(5),
              height: 178,
              /*aqui era height: 200, deu overflow de 22 pixels quando coloquei o texto(titulo).
              ver onde mais posso mexer pra manter os 200 e nao dar overflow no texto*/

              //color: Colors.green,
              //child: Container(color: Colors.green),
              child: Image.asset("lib/assets/" + counter.toString() + ".jpg"),
              //child: Image(
              //  image: AssetImage("lib/assets/" + counter.toString() + ".jpg"),
              //),
            ),
            const Text("titulo do filme"),
          ],
        ),
      ),
    );
    if (counter == 12) {
      counter = 0;
    }
  }
  return gameList;
}
