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
    public int srcPrevPage = -1, destPrevPage = -1;             // IMPORTANT: Du's global variable from previous page
    private TextView src3;                                      // Area to output your System.out.ln in Android Studio Style

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
                finish();                                   // prevents back button
            }
        });

        src3 = findViewById(R.id.src2);

        // Important: If needed this the string format of chosen src and destination
        String receivedSrc = getIntent().getStringExtra("keysrc");
        String receivedDest = getIntent().getStringExtra("keydest");

        // Converting the string source into and int from 1 to 15
        if (receivedSrc.equals("01 Art Building")) srcPrevPage = 1;
        else if (receivedSrc.equals("02 Auditorium")) srcPrevPage = 2;
        else if (receivedSrc.equals("03 Chemistry")) srcPrevPage = 3;
        else if (receivedSrc.equals("04 Curry Hall")) srcPrevPage = 4;
        else if (receivedSrc.equals("05 General Academic Building")) srcPrevPage = 5;
        else if (receivedSrc.equals("06 Hickory Hall")) srcPrevPage = 6;
        else if (receivedSrc.equals("07 Language Building")) srcPrevPage = 7;
        else if (receivedSrc.equals("08 Life Science Complex")) srcPrevPage = 8;
        else if (receivedSrc.equals("09 Marquis Hall")) srcPrevPage = 9;
        else if (receivedSrc.equals("10 Physics Building")) srcPrevPage = 10;
        else if (receivedSrc.equals("11 Radio, TV, Film and Performing Arts")) srcPrevPage = 11;
        else if (receivedSrc.equals("12 Sage Hall")) srcPrevPage = 12;
        else if (receivedSrc.equals("13 Science Research Building")) srcPrevPage = 13;
        else if (receivedSrc.equals("14 Sycamore Hall")) srcPrevPage = 14;
        else if (receivedSrc.equals("15 Terrill Hall")) srcPrevPage = 15;
        else if (receivedSrc.equals("16 Bain Hall")) srcPrevPage = 16;
        else if (receivedSrc.equals("17 Business Leadership Building")) srcPrevPage = 17;
        else if (receivedSrc.equals("18 Chilton Hall")) srcPrevPage = 18;
        else if (receivedSrc.equals("19 Eagle Student Center")) srcPrevPage = 19;
        else if (receivedSrc.equals("20 Environmental Science")) srcPrevPage = 20;
        else if (receivedSrc.equals("21 Gateway Center")) srcPrevPage = 21;
        else if (receivedSrc.equals("22 Matthews Hall")) srcPrevPage = 22;
        else if (receivedSrc.equals("23 McConnell Hall")) srcPrevPage = 23;
        else if (receivedSrc.equals("24 Music Building")) srcPrevPage = 24;
        else if (receivedSrc.equals("25 Music Practice Rooms")) srcPrevPage = 25;
        else if (receivedSrc.equals("26 Physical Education Building")) srcPrevPage = 26;
        else if (receivedSrc.equals("27 Union")) srcPrevPage = 27;
        else if (receivedSrc.equals("28 Wooten Hall")) srcPrevPage = 28;

        // Converting the string destination into and int from 1 to 15
        if (receivedDest.equals("01 Art Building")) destPrevPage = 1;
        else if (receivedDest.equals("02 Auditorium")) destPrevPage = 2;
        else if (receivedDest.equals("03 Chemistry")) destPrevPage = 3;
        else if (receivedDest.equals("04 Curry Hall")) destPrevPage = 4;
        else if (receivedDest.equals("05 General Academic Building")) destPrevPage = 5;
        else if (receivedDest.equals("06 Hickory Hall")) destPrevPage = 6;
        else if (receivedDest.equals("07 Language Building")) destPrevPage = 7;
        else if (receivedDest.equals("08 Life Science Complex")) destPrevPage = 8;
        else if (receivedDest.equals("09 Marquis Hall")) destPrevPage = 9;
        else if (receivedDest.equals("10 Physics Building")) destPrevPage = 10;
        else if (receivedDest.equals("11 Radio, TV, Film and Performing Arts")) destPrevPage = 11;
        else if (receivedDest.equals("12 Sage Hall")) destPrevPage = 12;
        else if (receivedDest.equals("13 Science Research Building")) destPrevPage = 13;
        else if (receivedDest.equals("14 Sycamore Hall")) destPrevPage = 14;
        else if (receivedDest.equals("15 Terrill Hall")) destPrevPage = 15;
        else if (receivedDest.equals("16 Bain Hall")) destPrevPage = 16;
        else if (receivedDest.equals("17 Business Leadership Building")) destPrevPage = 17;
        else if (receivedDest.equals("18 Chilton Hall")) destPrevPage = 18;
        else if (receivedDest.equals("19 Eagle Student Center")) destPrevPage = 19;
        else if (receivedDest.equals("20 Environmental Science")) destPrevPage = 20;
        else if (receivedDest.equals("21 Gateway Center")) destPrevPage = 21;
        else if (receivedDest.equals("22 Matthews Hall")) destPrevPage = 22;
        else if (receivedDest.equals("23 McConnell Hall")) destPrevPage = 23;
        else if (receivedDest.equals("24 Music Building")) destPrevPage = 24;
        else if (receivedDest.equals("25 Music Practice Rooms")) destPrevPage = 25;
        else if (receivedDest.equals("26 Physical Education Building")) destPrevPage = 26;
        else if (receivedDest.equals("27 Union")) destPrevPage = 27;
        else if (receivedDest.equals("28 Wooten Hall")) destPrevPage = 28;

        // DEBUG: Comment this out went done testing if any syntax errors or typos in src and dest
        // was trying figure out why src and dest print out addy of a Node and not a int
        // System.out.printf("src: " + src + "\ndest: " + dest + "\n");

        Graph graph = new Graph();

        // Create nodes
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");
        Node nodeH = new Node("H");
        Node nodeI = new Node("I");
        Node nodeJ = new Node("J");
        Node nodeK = new Node("K");
        Node nodeL = new Node("L");
        Node nodeM = new Node("M");
        Node nodeN = new Node("N");
        Node nodeO = new Node("O");
        Node nodeP = new Node("P");
        Node nodeQ = new Node("Q");
        Node nodeR = new Node("R");
        Node nodeS = new Node("S");
        Node nodeT = new Node("T");
        // Expanded (Should be 27 new nodes, checked)
        Node nodeAA = new Node("AA");
        Node nodeAB = new Node("AB");
        Node nodeAC = new Node("AC");
        Node nodeBA = new Node("BA");
        Node nodeBB = new Node("BB");
        Node nodeBC = new Node("BC");
        Node nodeCA = new Node("CA");
        Node nodeCB = new Node("CB");
        Node nodeCC = new Node("CC");
        Node nodeCD = new Node("CD");
        Node nodeCE = new Node("CE");
        Node nodeCF = new Node("CF");
        Node nodeCG = new Node("CG");
        Node nodeCH = new Node("CH");
        Node nodeCI = new Node("CI");
        Node nodeDA = new Node("DA");
        Node nodeDB = new Node("DB");
        Node nodeDC = new Node("DC");
        Node nodeDD = new Node("DD");
        Node nodeDE = new Node("DE");
        Node nodeEA = new Node("EA");
        Node nodeEB = new Node("EB");
        Node nodeEC = new Node("EC");
        Node nodeED = new Node("ED");
        Node nodeEE = new Node("EE");
        Node nodeEF = new Node("EF");
        Node nodeFA = new Node("FA");

        // Add nodes to graph
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
        // Expanded (Should still be 27 new nodes, checked)
        graph.addNode(nodeAA);
        graph.addNode(nodeAB);
        graph.addNode(nodeAC);
        graph.addNode(nodeBA);
        graph.addNode(nodeBB);
        graph.addNode(nodeBC);
        graph.addNode(nodeCA);
        graph.addNode(nodeCB);
        graph.addNode(nodeCC);
        graph.addNode(nodeCD);
        graph.addNode(nodeCE);
        graph.addNode(nodeCF);
        graph.addNode(nodeCG);
        graph.addNode(nodeCH);
        graph.addNode(nodeCI);
        graph.addNode(nodeDA);
        graph.addNode(nodeDB);
        graph.addNode(nodeDC);
        graph.addNode(nodeDD);
        graph.addNode(nodeDE);
        graph.addNode(nodeEA);
        graph.addNode(nodeEB);
        graph.addNode(nodeEC);
        graph.addNode(nodeED);
        graph.addNode(nodeEE);
        graph.addNode(nodeEF);
        graph.addNode(nodeFA);

        // Add edges with weights and custom names
        graph.addEdge(nodeA, nodeB, 110, "Head East on W Mulberry St, 110 ft");
        graph.addEdge(nodeB, nodeA, 110, "Head West on W Mulberry St, 110 ft");
        graph.addEdge(nodeB, nodeC, 105, "Head East on W Mulberry S, 105 ft");
        graph.addEdge(nodeC, nodeB, 105, "Head West on W Mulberry St, 105 ft");
        graph.addEdge(nodeC, nodeD, 110, "Head East on W Mulberry St, 110 ft");
        graph.addEdge(nodeD, nodeC, 110, "Head West on W Mulberry St, 110 ft");
        graph.addEdge(nodeD, nodeE, 200, "Head East on UNT Shared Pathways, 200 ft");
        graph.addEdge(nodeE, nodeD, 200, "Head West on UNT Shared Pathways, 200 ft");
        graph.addEdge(nodeE, nodeF, 200, "Head East on UNT Shared Pathways, 200 ft");
        graph.addEdge(nodeF, nodeE, 200, "Head West on UNT Shared Pathways, 200 ft");
        graph.addEdge(nodeF, nodeG, 200, "Head East on UNT Shared Pathways, 200 ft");
        graph.addEdge(nodeG, nodeF, 200, "Head West on UNT Shared Pathways, 200 ft");
        graph.addEdge(nodeG, nodeH, 200, "Head East on UNT Shared Pathways, 200 ft");
        graph.addEdge(nodeH, nodeG, 200, "Head West on UNT Shared Pathways, 200 ft");
        graph.addEdge(nodeA, nodeI, 220, "Head South, 375 ft");
        graph.addEdge(nodeI, nodeA, 220, "Head North, 375 ft");
        graph.addEdge(nodeA, nodeJ, 240, "Head SouthEast toward W Sycamore St, 240 ft");
        graph.addEdge(nodeJ, nodeA, 240, "Head NorthWest toward W Mulberry St, 240 ft");
        graph.addEdge(nodeB, nodeJ, 177, "Head South on W Sycamore St, 177 ft");
        graph.addEdge(nodeJ, nodeB, 177, "Head North on W Sycamore St 177 ft");
        graph.addEdge(nodeD, nodeK, 220, "Head South on UNT Shared Pathways, 220 ft");
        graph.addEdge(nodeK, nodeD, 220, "Head North on UNT Shared Pathways, 220 ft");
        graph.addEdge(nodeF, nodeL, 79, "Head South on UNT Shared Pathways, 79 ft");
        graph.addEdge(nodeL, nodeF, 79, "Head North on UNT Shared Pathways, 79 ft");
        graph.addEdge(nodeL, nodeM, 100, "Head South on UNT Shared Pathways, 100 ft");
        graph.addEdge(nodeM, nodeL, 100, "Head North on UNT Shared Pathways, 100 ft");
        graph.addEdge(nodeL, nodeN, 280, "Head SouthEast on UNT Shared Pathways, 280 ft");
        graph.addEdge(nodeN, nodeL, 280, "Head NorthWest on UNT Shared Pathways, 280 ft");
        graph.addEdge(nodeH, nodeN, 243, "Head SouthEast, 243 ft");
        graph.addEdge(nodeN, nodeH, 243, "Head NorthWest, 243 ft");
        graph.addEdge(nodeI, nodeJ, 100, "Head East, 100ft");
        graph.addEdge(nodeJ, nodeI, 100, "Head West, 100ft");
        graph.addEdge(nodeJ, nodeK, 225, "Head East, 225 ft");
        graph.addEdge(nodeK, nodeJ, 225, "Head West, 225 ft");
        graph.addEdge(nodeM, nodeN, 300, "Head East, 300 ft");
        graph.addEdge(nodeN, nodeM, 300, "Head West, 300 ft");
        graph.addEdge(nodeJ, nodeO, 332, "Head South on W Scamore St, 332 ft");
        graph.addEdge(nodeO, nodeJ, 332, "Head North on W Scamore St, 332 ft");
        graph.addEdge(nodeK, nodeP, 280, "Head South on UNT Shared Pathways, 280 ft");
        graph.addEdge(nodeP, nodeK, 280, "Head North on UNT Shared Pathways, 280 ft");
        graph.addEdge(nodeK, nodeQ, 380, "Head SouthEast on UNT Shared Pathways, 380 ft");
        graph.addEdge(nodeQ, nodeK, 380, "Head NorthWest on UNT Shared Pathways, 380 ft");
        graph.addEdge(nodeQ, nodeM, 325, "Head NorthEast on UNT Shared Pathways, 325 ft");
        graph.addEdge(nodeM, nodeQ, 325, "Head SouthWest on UNT Shared Pathways, 325 ft");
        graph.addEdge(nodeM, nodeR, 255, "Head South on UNT Shared Pathways, 255 ft");
        graph.addEdge(nodeR, nodeM, 255, "Head North on UNT Shared Pathways, 255 ft");
        graph.addEdge(nodeN, nodeT, 240, "Head South on UNT Shared Pathways, 240 ft");
        graph.addEdge(nodeT, nodeN, 240, "Head North on UNT Shared Pathways, 240 ft");
        graph.addEdge(nodeO, nodeP, 220, "Head East on UNT Shared Pathways, 220 ft");
        graph.addEdge(nodeP, nodeO, 220, "Head West on UNT Shared Pathways, 220 ft");
        graph.addEdge(nodeP, nodeQ, 145, "Head East on UNT Shared Pathways, 145 ft");
        graph.addEdge(nodeQ, nodeP, 145, "Head West on UNT Shared Pathways, 145 ft");
        graph.addEdge(nodeQ, nodeR, 210, "Head East on UNT Shared Pathways, 210 ft");
        graph.addEdge(nodeR, nodeQ, 210, "Head West on UNT Shared Pathways, 210 ft");
        graph.addEdge(nodeR, nodeS, 230, "Head East on UNT Shared Pathways, 230 ft");
        graph.addEdge(nodeS, nodeR, 230, "Head West on UNT Shared Pathways, 230 ft");
        graph.addEdge(nodeS, nodeT, 210, "Head East on UNT Shared Pathways, 310 ft");
        graph.addEdge(nodeT, nodeS, 210, "Head West on UNT Shared Pathways, 310 ft");
        // Expanded (Should have 90 new Edges)
        graph.addEdge(nodeAA, nodeAB, 520, "Head East on W Mulberry St, 520 ft");
        graph.addEdge(nodeAB, nodeAA, 520, "Head West on W Mulbery St, 520 ft");
        graph.addEdge(nodeAB, nodeAC, 130, "Head East on W Mulberry St, 130 ft");
        graph.addEdge(nodeAC, nodeAB, 130, "Head West on W Mulberry St, 130 ft");
        graph.addEdge(nodeAC, nodeA, 190, "Head East on W Mulberry St, 190 ft");
        graph.addEdge(nodeA, nodeAC, 190, "Head West on W Mulberry St, 190 ft");
        graph.addEdge(nodeAA, nodeBA, 350, "Head South on Avenue D, 350 ft");
        graph.addEdge(nodeBA, nodeAA, 350, "Head North on Avenue D, 350 ft");
        graph.addEdge(nodeAB, nodeBB, 350, "Head South thru the Parking Lot, 350 ft");
        graph.addEdge(nodeBB, nodeAB, 350, "Head North thru the Parking Lot, 350 ft");
        graph.addEdge(nodeAC, nodeBC, 350, "Head South on Avenue C, 350 ft");
        graph.addEdge(nodeBC, nodeAC, 350, "Head North on Avenue C, 350 ft");
        graph.addEdge(nodeBA, nodeBB, 520, "Head East on W Sycamore St, 520 ft");
        graph.addEdge(nodeBB, nodeBA, 520, "Head West on W Sycamore St, 520 ft");
        graph.addEdge(nodeBB, nodeBC, 130, "Head East on W Sycamore St, 130 ft");
        graph.addEdge(nodeBC, nodeBB, 130, "Head West on W Sycamore St, 130 ft");
        graph.addEdge(nodeBC, nodeI, 340, "Head East thru the Parking Lot, 340 ft");
        graph.addEdge(nodeI, nodeBC, 340, "Head West thru the Parking Lot, 340 ft");
        graph.addEdge(nodeI, nodeO, 250, "Head South East, 250 ft");
        graph.addEdge(nodeO, nodeI, 250, "Head North West, 250 ft");
        graph.addEdge(nodeBA, nodeCA, 400, "Head South on Avenue D, 400 ft");
        graph.addEdge(nodeCA, nodeBA, 400, "Head North on Avenue D, 400 ft");
        graph.addEdge(nodeBC, nodeCC, 400, "Head South on Avenue C, 400 ft");
        graph.addEdge(nodeCC, nodeBC, 400, "Head North on Avenue C, 400 ft");
        graph.addEdge(nodeO, nodeCE, 380, "Head South on UNT Shared Pathways, 380 ft");
        graph.addEdge(nodeCE, nodeO, 380, "Head North on UNT Shared Pathways, 380 ft");
        graph.addEdge(nodeP, nodeCF, 380, "Head South on UNT Shared Pathways, 380 ft");
        graph.addEdge(nodeCF, nodeP, 380, "Head North on UNT Shared Pathways, 380 ft");
        graph.addEdge(nodeR, nodeCH, 380, "(Illegally) Head South thru them food buildings, 380 ft");
        graph.addEdge(nodeCH, nodeR, 380, "(Illegally) Head North thru them food buildings, 380 ft");
        graph.addEdge(nodeT, nodeCI, 380, "Head South on UNT Shared Pathways, 380 ft");
        graph.addEdge(nodeCI, nodeT, 380, "Head North on UNT Shared Pathways, 380 ft");
        graph.addEdge(nodeCA, nodeCB, 520, "Head East on Chestnut St, 520 ft");
        graph.addEdge(nodeCB, nodeCA, 520, "Head West on Chestnut St, 520 ft");
        graph.addEdge(nodeCB, nodeCC, 130, "Head East on Chestnut St, 130 ft");
        graph.addEdge(nodeCC, nodeCB, 130, "Head West on Chestnut St, 130 ft");
        graph.addEdge(nodeCC, nodeCD, 250, "Head East on Chestnut St, 250 ft");
        graph.addEdge(nodeCD, nodeCC, 250, "Head West on Chestnut St, 250 ft");
        graph.addEdge(nodeCD, nodeCE, 230, "Head East thru the Parking Lot, 230 ft");
        graph.addEdge(nodeCE, nodeCD, 230, "Head West thru the Parking Lot, 230 ft");
        graph.addEdge(nodeCE, nodeCF, 300, "Head East on UNT Shared Pathways, 300 ft");
        graph.addEdge(nodeCF, nodeCE, 300, "Head West on UNT Shared Pathways, 300 ft");
        graph.addEdge(nodeCF, nodeCG, 250, "Head East on UNT Shared Pathways toward Union, 250 ft");
        graph.addEdge(nodeCG, nodeCF, 250, "Head West on UNT Shared Pathways away from Union, 250ft");
        graph.addEdge(nodeCG, nodeCH, 240, "Head East on UNT Shared Pathways, 240 ft");
        graph.addEdge(nodeCH, nodeCG, 240, "Head West on UNT Shared Pathways, 240 ft");
        graph.addEdge(nodeCH, nodeCI, 400, "Head East on UNT Shared Pathways away from Union, 400 ft");
        graph.addEdge(nodeCI, nodeCH, 400, "Head West on UNT Shared Pathways toward Union, 400 ft");
        graph.addEdge(nodeCA, nodeDA, 440, "Head South around Physical Education Building, 440 ft");
        graph.addEdge(nodeDA, nodeCA, 440, "Head North around Physical Education Building, 440 ft");
        graph.addEdge(nodeCC, nodeDB, 440, "Head South on Avenue C, 440 ft");
        graph.addEdge(nodeDB, nodeCC, 440, "Head North on Avenue C, 440 ft");
        graph.addEdge(nodeCE, nodeDC, 440, "Head South on UNT Shared Pathways, 440 ft");
        graph.addEdge(nodeDC, nodeCE, 440, "Head North on UNT Shared Pathways, 440 ft");
        graph.addEdge(nodeCF, nodeDD, 460, "Head South around Adminstration Building, 460 ft");
        graph.addEdge(nodeDD, nodeCF, 460, "Head North around Adminstration Building, 460 ft");
        graph.addEdge(nodeCI, nodeDE, 440, "Head South toward BSM Church, 440 ft");
        graph.addEdge(nodeDE, nodeCI, 440, "Head North away from BSM Church, 440 ft");
        graph.addEdge(nodeDA, nodeDB, 650, "Head East on UNT Shared Pathways, 650 ft");
        graph.addEdge(nodeDB, nodeDA, 650, "Head West on UNT Shared Pathways, 650 ft");
        graph.addEdge(nodeDB, nodeDC, 480, "Head East on UNT Shared Pathways, 480 ft");
        graph.addEdge(nodeDC, nodeDB, 480, "Head West on UNT Shared Pathways, 480 ft");
        graph.addEdge(nodeDC, nodeDD, 230, "Head East on UNT Shared Pathways, 230 ft");
        graph.addEdge(nodeDD, nodeDC, 230, "Head West on UNT Shared Pathways, 230 ft");
        graph.addEdge(nodeDD, nodeDE, 730, "Head East on UNT Shared Pathways, 730 ft");
        graph.addEdge(nodeDE, nodeDD, 730, "Head West on UNT Shared Pathways, 730 ft");
        graph.addEdge(nodeDA, nodeEA, 400, "Head South on UNT Shared Pathways, 400 ft");
        graph.addEdge(nodeEA, nodeDA, 400, "Head North on UNT Shared Pathways, 400 ft");
        graph.addEdge(nodeDB, nodeEB, 400, "Head South on Avenue C, 400 ft");
        graph.addEdge(nodeEB, nodeDB, 400, "Head North on Avenue C, 400 ft");
        graph.addEdge(nodeDC, nodeEC, 400, "Head South on UNT Shared Pathways, 400 ft");
        graph.addEdge(nodeEC, nodeDC, 400, "Head North on UNT Shared Pathways, 400 ft");
        graph.addEdge(nodeDD, nodeED, 400, "Head South on UNT Shared Pathways, 400 ft");
        graph.addEdge(nodeED, nodeDD, 400, "Head North on UNT Shared Pathways, 400 ft");
        graph.addEdge(nodeDE, nodeEF, 400, "Head South on UNT Shared Pathways, 400 ft");
        graph.addEdge(nodeEF, nodeDE, 400, "Head North on UNT Shared Pathways, 400 ft");
        graph.addEdge(nodeEA, nodeEB, 650, "Head East on Highland St, 650 ft");
        graph.addEdge(nodeEB, nodeEA, 650, "Head West on Highland St, 650 ft");
        graph.addEdge(nodeEB, nodeEC, 480, "Head East on Highland St, 480 ft");
        graph.addEdge(nodeEC, nodeEB, 480, "Head West on Highland St, 480 ft");
        graph.addEdge(nodeEC, nodeED, 230, "Head East on Highland St, 230 ft");
        graph.addEdge(nodeED, nodeEC, 230, "Head West on Highland St, 230 ft");
        graph.addEdge(nodeED, nodeEE, 320, "Head East on Highland St, 320 ft");
        graph.addEdge(nodeEE, nodeED, 320, "Head West on Highland St, 320 ft");
        graph.addEdge(nodeEE, nodeEF, 400, "Head East on Highland St, 400 ft");
        graph.addEdge(nodeEF, nodeEE, 400, "Head West on Highland St, 400 ft");
        graph.addEdge(nodeEA, nodeFA, 400, "Head South on Avenue D, 400 ft");
        graph.addEdge(nodeFA, nodeEA, 400, "Head North on Avenue D, 400 ft");
        graph.addEdge(nodeEB, nodeFA, 500, "Head South West thru the Parking Lot toward Avenue D, 500 ft");
        graph.addEdge(nodeFA, nodeEB, 500, "Head North East thru the Parking Lot toward Avenue C, 500 ft");

        // Run Dijkstra's algorithm from node F (START)
        Map<Node, Edge> prevEdges = new HashMap<>();

        Node srcNode = new Node("");                                // initialize w/ blank
        Node destNode = new Node("");                               // initialize w/ blank

        // Later implement this into Android Studio Code w/ 1 liner
        if (srcPrevPage == 1) srcNode = nodeN;                  // 01 Art Building
        else if (srcPrevPage == 2) srcNode = nodeF;             // 02 Auditorium
        else if (srcPrevPage == 3) srcNode = nodeA;             // 03 Chemistry Building
        else if (srcPrevPage == 4) srcNode = nodeL;             // 04 Curry Hall
        else if (srcPrevPage == 5) srcNode = nodeK;             // 05 General Academic Building
        else if (srcPrevPage == 6) srcNode = nodeE;             // 06 Hickory Hall
        else if (srcPrevPage == 7) srcNode = nodeG;             // 07 Language Building
        else if (srcPrevPage == 8) srcNode = nodeO;             // 08 Life Science Complex
        else if (srcPrevPage == 9) srcNode = nodeJ;             // 09 Marquis Hall
        else if (srcPrevPage == 10) srcNode = nodeM;            // 10 Physics Building
        else if (srcPrevPage == 11) srcNode = nodeT;            // 11 Radio, TV, Film and Performing Building
        else if (srcPrevPage == 12) srcNode = nodeS;            // 12 Sage Hall
        else if (srcPrevPage == 13) srcNode = nodeC;            // 13 Science Research Building
        else if (srcPrevPage == 14) srcNode = nodeQ;            // 14 Sycamore Hall
        else if (srcPrevPage == 15) srcNode = nodeI;            // 15 Terrill Hall
            // Expanded, src 16-28
        else if (srcPrevPage == 16) srcNode = nodeEA;           // 16 Bain Hall
        else if (srcPrevPage == 17) srcNode = nodeEE;           // 17 Business Leadership Building
        else if (srcPrevPage == 18) srcNode = nodeCB;           // 18 Chilton Hall
        else if (srcPrevPage == 19) srcNode = nodeDD;           // 19 Eagle Student Center
        else if (srcPrevPage == 20) srcNode = nodeAB;           // 20 Environmental Science
        else if (srcPrevPage == 21) srcNode = nodeFA;           // 21 Gateway Center
        else if (srcPrevPage == 22) srcNode = nodeDE;           // 22 Matthews Hall
        else if (srcPrevPage == 23) srcNode = nodeBB;           // 23 McConnell Hall
        else if (srcPrevPage == 24) srcNode = nodeCD;           // 24 Music Building
        else if (srcPrevPage == 25) srcNode = nodeDB;           // 25 Music Practice Rooms
        else if (srcPrevPage == 26) srcNode = nodeCA;           // 26 Physical Education Building
        else if (srcPrevPage == 27) srcNode = nodeCH;           // 27 Union
        else if (srcPrevPage == 28) srcNode = nodeEF;           // 28 Wooten Hall
        else srcNode = nodeA;

        if (destPrevPage == 1) destNode = nodeN;                // 01 Art Building
        else if (destPrevPage == 2) destNode = nodeF;           // 02 Auditorium
        else if (destPrevPage == 3) destNode = nodeA;           // 03 Chemistry Building
        else if (destPrevPage == 4) destNode = nodeL;           // 04 Curry Hall
        else if (destPrevPage == 5) destNode = nodeK;           // 05 General Academic Building
        else if (destPrevPage == 6) destNode = nodeE;           // 06 Hickory Hall
        else if (destPrevPage == 7) destNode = nodeG;           // 07 Language Building
        else if (destPrevPage == 8) destNode = nodeO;           // 08 Life Science Complex
        else if (destPrevPage == 9) destNode = nodeJ;           // 09 Marquis Hall
        else if (destPrevPage == 10) destNode = nodeM;          // 10 Physics Building
        else if (destPrevPage == 11) destNode = nodeT;          // 11 Radio, TV, Film and Performing Building
        else if (destPrevPage == 12) destNode = nodeS;          // 12 Sage Hall
        else if (destPrevPage == 13) destNode = nodeC;          // 13 Science Research Building
        else if (destPrevPage == 14) destNode = nodeQ;          // 14 Sycamore Hall
        else if (destPrevPage == 15) destNode = nodeI;          // 15 Terrill Hall
            // Expanded, dest 16-28
        else if (destPrevPage == 16) destNode = nodeEA;         // 16 Bain Hall
        else if (destPrevPage == 17) destNode = nodeEE;         // 17 Business Leadership Building
        else if (destPrevPage == 18) destNode = nodeCB;         // 18 Chilton Hall
        else if (destPrevPage == 19) destNode = nodeDD;         // 19 Eagle Student Center
        else if (destPrevPage == 20) destNode = nodeAB;         // 20 Environmental Science
        else if (destPrevPage == 21) destNode = nodeFA;         // 21 Gateway Center
        else if (destPrevPage == 22) destNode = nodeDE;         // 22 Matthews Hall
        else if (destPrevPage == 23) destNode = nodeBB;         // 23 McConnell Hall
        else if (destPrevPage == 24) destNode = nodeCD;         // 24 Music Building
        else if (destPrevPage == 25) destNode = nodeDB;         // 25 Music Practice Rooms
        else if (destPrevPage == 26) destNode = nodeCA;         // 26 Physical Education Building
        else if (destPrevPage == 27) destNode = nodeCH;         // 27 Union
        else if (destPrevPage == 28) destNode = nodeEF;         // 28 Wooten Hall
        else destNode = nodeA;

        try {
            // Run Dijkstra's algorithm from srcNode
            Map<Node, Double> distances = graph.dijkstra(srcNode, prevEdges);

            // Check if destNode is reachable
            if (!distances.containsKey(destNode)) {
                // System.out.println("No path found from " + srcNode + " to " + destNode);
                src3.setText("No path found from " + receivedSrc + " to " + receivedDest + "\n");
            } else {
                // Retrieve path and distance
                List<Edge> path = graph.getPath(srcNode, destNode, prevEdges);

                /*
                StringBuilder pathString = new StringBuilder();
                for (Edge edge : path) {
                    pathString.append(edge.getName()).append(" -> ");
                }
                // Remove the last " -> " from the end
                if (pathString.length() > 0) {
                    pathString.setLength(pathString.length() - 4);
                }
                */

                Double distance = distances.get(destNode);

                String total = "";
                for (Edge direction : path) {
                    total = total + direction + "\n";
                }
                src3.setText("Shortest path from " + receivedSrc + " to " + receivedDest + ":\n" + total + "\n\nTotal Distance: " + distance + " ft\nTotal Walking Time: " + Math.ceil(distance/250) + " min");

                // System.out.println("Shortest path from " + srcNode + " to " + destNode + ": " + pathString.toString());
                // System.out.println("\nTotal Distance: " + distance + " ft");
                // System.out.println("Total Walking Time: " + Math.ceil(distance/250) + " min");        // Assume 250 ft/min
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error finding path from " + srcNode + " to " + destNode + ": " + e.getMessage());
        }

        /* DEBUG blocking Nathan Code
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
        // Added Buildings (16-28)




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

        // DEBUG: might get errors here later, since class has int src and int dest
        // using same variable names with different data types, was messing up my System.out.printf
        // I fixed it can use src and dest as Node class, refactor/renamed other
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
        */

        // Du Brute Force Method for Map Solution
        // Comment or remove this when get algorithm done (leaving this here for learning purposes)
        // Dummy emergency = new Dummy(src, dest);
        // src3.setText("From: " + receivedSrc + "\nTo: " + receivedDest + "\n\n" + emergency.BruteForce());
    }
}