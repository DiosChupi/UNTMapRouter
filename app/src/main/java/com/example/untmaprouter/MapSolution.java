package com.example.untmaprouter;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;                     // DEBUG
import java.util.*;

public class MapSolution extends AppCompatActivity {
    Button backMap;
    public int src = -1,dest = -1;                  // IMPORTANT: Du's global variable from previous page
    private TextView src3;                          // Area to output your System.out.ln in Android Studio Style

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_map_solution);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Back Button logic when clicked on goes to Navigation activity/page/screen
        backMap = findViewById(R.id.backMapButton);
        backMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapSolution.this, Navigation.class);
                startActivity(intent);
                finish();                               // prevents back button
            }
        });

        src3 = findViewById(R.id.src2);

        // Important: If needed this the string format of chosen src and destination
        String receivedSrc = getIntent().getStringExtra("keysrc");
        String receivedDest = getIntent().getStringExtra("keydest");

        // Converting the string source into and int from 1 to 15
        if (receivedSrc.equals("01 Art Building")) src = 1;
        else if (receivedSrc.equals("02 Auditorium")) src = 2;
        else if (receivedSrc.equals("03 Chemistry")) src = 3;
        else if (receivedSrc.equals("04 Curry Hall")) src = 4;
        else if (receivedSrc.equals("05 General Academic Building")) src = 5;
        else if (receivedSrc.equals("06 Hickory Hall")) src = 6;
        else if (receivedSrc.equals("07 Language Building")) src = 7;
        else if (receivedSrc.equals("08 Life Science Complex")) src = 8;
        else if (receivedSrc.equals("09 Marquis Hall")) src = 9;
        else if (receivedSrc.equals("10 Physics Building")) src = 10;
        else if (receivedSrc.equals("11 Radio, TV, Film and Performing Arts")) src = 11;
        else if (receivedSrc.equals("12 Sage Hall")) src = 12;
        else if (receivedSrc.equals("13 Science Research Building")) src = 13;
        else if (receivedSrc.equals("14 Sycamore Hall")) src = 14;
        else if (receivedSrc.equals("15 Terrill Hall")) src = 15;

        // Converting the string destination into and int from 1 to 15
        if (receivedDest.equals("01 Art Building")) dest = 1;
        else if (receivedDest.equals("02 Auditorium")) dest = 2;
        else if (receivedDest.equals("03 Chemistry")) dest = 3;
        else if (receivedDest.equals("04 Curry Hall")) dest = 4;
        else if (receivedDest.equals("05 General Academic Building")) dest = 5;
        else if (receivedDest.equals("06 Hickory Hall")) dest = 6;
        else if (receivedDest.equals("07 Language Building")) dest = 7;
        else if (receivedDest.equals("08 Life Science Complex")) dest = 8;
        else if (receivedDest.equals("09 Marquis Hall")) dest = 9;
        else if (receivedDest.equals("10 Physics Building")) dest = 10;
        else if (receivedDest.equals("11 Radio, TV, Film and Performing Arts")) dest = 11;
        else if (receivedDest.equals("12 Sage Hall")) dest = 12;
        else if (receivedDest.equals("13 Science Research Building")) dest = 13;
        else if (receivedDest.equals("14 Sycamore Hall")) dest = 14;
        else if (receivedDest.equals("15 Terrill Hall")) dest = 15;

        Graph graph = new Graph();

        // Creating nodes (intersections or buildings)
        Node nodeA = new Node("03 Chemistry");
        Node nodeB = new Node("Mulbury/Sycamore Intersection");
        Node nodeC = new Node("13 Science Research Building");
        Node nodeD = new Node("Mulbury/GAB Intersection");
        Node nodeE = new Node("05 General Academic Building");
        Node nodeF = new Node("15 Terrill Hall");
        Node nodeG = new Node("09 Marquis Hall");
        Node nodeH = new Node("14 Sycamore Hall");
        Node nodeI = new Node("Biology building");
        Node nodeJ = new Node("12 Sage Hall");
        Node nodeK = new Node("11 Radio, TV, Film and Performing Arts");
        Node nodeL = new Node("04 Curry Hall");
        Node nodeM = new Node("01 Art Building");
        Node nodeN = new Node("10 Physics Building");
        Node nodeO = new Node("07 Language Building");
        Node nodeP = new Node("International Affairs Pathways");
        Node nodeQ = new Node("06 Hickory Hall");
        Node nodeR = new Node("Sycamore Hall Pathways");
        Node nodeS = new Node("South East GAB Pathways");
        Node nodeT = new Node("Sage Hall Pathways");
        Node nodeU = new Node("English Department");
        Node nodeV = new Node("Curry Hall Pathways");
        Node nodeW = new Node("Visual Arts Pathways");
        Node nodeY = new Node("02 Auditorium");
        Node nodeX = new Node("08 Life Science Complex");


        // Adding nodes to the graph
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);
        graph.addNode(nodeG);
        graph.addNode(nodeH);
        graph.addNode(nodeI);
        graph.addNode(nodeJ);
        graph.addNode(nodeK);
        graph.addNode(nodeL);
        graph.addNode(nodeM);
        graph.addNode(nodeN);
        graph.addNode(nodeO);
        graph.addNode(nodeP);
        graph.addNode(nodeQ);
        graph.addNode(nodeR);
        graph.addNode(nodeS);
        graph.addNode(nodeT);
        graph.addNode(nodeU);
        graph.addNode(nodeV);
        graph.addNode(nodeW);
        graph.addNode(nodeY);
        graph.addNode(nodeX);

        // Adding edges (roads) with weights (lengths in miles) and directions
        // CHEM TO MUL
        graph.addEdge(nodeA, nodeB, 1.2, "east");
        graph.addEdge(nodeB, nodeA, 1.2, "west");
        // MUL TO SCIENCE
        graph.addEdge(nodeB, nodeC, 2.5, "east");
        graph.addEdge(nodeC, nodeB, 2.5, "west");
        // SCIENCE TO MUL/GAB
        graph.addEdge(nodeC, nodeD, 1.0, "east");
        graph.addEdge(nodeD, nodeC, 1.0, "west");
        // MUL/GAB TO GAB
        graph.addEdge(nodeD, nodeE, 3.0, "south");
        graph.addEdge(nodeE, nodeD, 3.0, "north");
        // MUL/GAB TO INT AFFAIRS
        graph.addEdge(nodeD, nodeG, 3.0, "south");
        graph.addEdge(nodeG, nodeD, 3.0, "north");
        // MUL TO LIBERAL ARTS
        graph.addEdge(nodeB, nodeF, 3.0, "south");
        graph.addEdge(nodeF, nodeB, 3.0, "north");
        // GAB TO INT AFFAIRS PATHWAYS
        graph.addEdge(nodeE, nodeP, 3.0, "south");
        graph.addEdge(nodeP, nodeE, 3.0, "north");
        // INT AFFAIRS PATHWAYS TO LIBERAL ARTS
        graph.addEdge(nodeF, nodeP, 1.0, "east");
        graph.addEdge(nodeP, nodeF, 1.0, "west");
        // MUL/GAB TO HICKORY
        graph.addEdge(nodeD, nodeQ, 1.0, "east");
        graph.addEdge(nodeQ, nodeD, 1.0, "west");
        // INT AFFAIRS PATHWAYS TO SYC HALL PATHWAYS
        graph.addEdge(nodeP, nodeR, 3.0, "south");
        graph.addEdge(nodeR, nodeP, 3.0, "north");
        // SYC HALL PATHWAYS TO SYC HALL
        graph.addEdge(nodeR, nodeH, 3.0, "south");
        graph.addEdge(nodeH, nodeR, 3.0, "north");
        // SYC HALL TO BIO
        graph.addEdge(nodeH, nodeI, 3.0, "south");
        graph.addEdge(nodeI, nodeH, 3.0, "north");
        // SYC HALL PATHWAYS TO SE GAB PATHWAYS
        graph.addEdge(nodeR, nodeS, 3.0, "east");
        graph.addEdge(nodeS, nodeR, 3.0, "west");
        // SYC HALL TO BIO
        graph.addEdge(nodeH, nodeI, 3.0, "south");
        graph.addEdge(nodeI, nodeH, 3.0, "north");

        graph.addEdge(nodeQ, nodeU, 2.0, "east");
        graph.addEdge(nodeU, nodeQ, 2.0, "west");

        graph.addEdge(nodeS, nodeJ, 4.0, "south");
        graph.addEdge(nodeJ, nodeS, 4.0, "north");

        graph.addEdge(nodeS, nodeT, 3.0, "east");
        graph.addEdge(nodeT, nodeS, 3.0, "west");

        graph.addEdge(nodeT, nodeK, 1.5, "south");
        graph.addEdge(nodeK, nodeT, 1.5, "north");

        graph.addEdge(nodeT, nodeM, 2.5, "north");
        graph.addEdge(nodeM, nodeT, 2.5, "south");

        graph.addEdge(nodeM, nodeN, 3.0, "north");
        graph.addEdge(nodeN, nodeM, 3.0, "south");

        graph.addEdge(nodeN, nodeW, 2.0, "north");
        graph.addEdge(nodeW, nodeN, 2.0, "south");

        graph.addEdge(nodeW, nodeO, 1.0, "west");
        graph.addEdge(nodeO, nodeW, 1.0, "east");

        graph.addEdge(nodeO, nodeV, 2.5, "west");
        graph.addEdge(nodeV, nodeO, 2.5, "east");

        graph.addEdge(nodeV, nodeU, 3.0, "north");
        graph.addEdge(nodeU, nodeV, 3.0, "south");

        graph.addEdge(nodeQ, nodeU, 2.0, "east");
        graph.addEdge(nodeU, nodeQ, 2.0, "west");

        graph.addEdge(nodeV, nodeL, 1.5, "south");
        graph.addEdge(nodeL, nodeV, 1.5, "north");

        graph.addEdge(nodeV, nodeY, 2.0, "east");
        graph.addEdge(nodeY, nodeV, 2.0, "west");

        graph.addEdge(nodeX, nodeH, 2.0, "west");
        graph.addEdge(nodeH, nodeX, 2.0, "east");


        Node src = graph.getNodeByName(receivedSrc);
        Node dest = graph.getNodeByName(receivedDest);

        if (src == null || dest == null) {
            src3.setText("Invalid source or destination");
        } else {
            // Running Dijkstra's algorithm to find the shortest path
            List<String> path = graph.dijkstra(src, dest);

            if (path.isEmpty()) {
                src3.setText("No path found from " + src.getName() + " to " + dest.getName());
            } else {
                String total = "";
                for (String direction : path) {
                    total = total + direction + "\n";
                }
                src3.setText("Shortest path from " + src.getName() + " to " + dest.getName() + ":\n" + total);
            }
        }

        // Du Brute Force Method for Map Solution
        // Comment or remove this when get algorithm done
        //Dummy emergency = new Dummy(src, dest);
        //src3.setText("From: " + receivedSrc + "\nTo: " + receivedDest + "\n\n" + emergency.BruteForce());
    }
}
