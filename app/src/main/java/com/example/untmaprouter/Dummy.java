package com.example.untmaprouter;

// Important: Only use this in emergency if teammate not get algo to work
public class Dummy {
    private int src;
    private int dest;

    // Constructor
    public Dummy(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }

    public String BruteForce() {
        switch (src) {
            case 1:
                switch (dest) {
                    case 1:
                        return "You are already there";
                    case 2:
                        return "Head West on Mulberry St towards Ave A\nSlight right at Ave A\nDestination on left";
                    case 3:
                        return "Head West on Mulberry St toward Ave A\nSlight right at Ave A\nTurn right toward Mulberry St\nTurn left onto Mulberry St\nSlight right at Sycamore St\nDestination on right";
                    case 4:
                        return "Head west on Mulberry St toward Ave A\nDestination will be on the left";
                    case 5:
                        return "Head west on Mulberry St toward Ave A\nSlight right at Ave A\nTurn left\nSlight right\nDestination will be on the right";
                    case 6:
                        return "Head west on Mulberry St toward Ave A\nTurn right onto Ave A";
                    case 7:
                        return "Head west on Mulberry St toward Ave A\nTurn right onto Ave A\nDestination will be on the left";
                    case 8:
                        return "Head west on Mulberry St toward Ave A\nSlight right at Ave A\nTurn left\nTurn right toward Chestnut St\nTurn left toward Chestnut St\nTurn right toward Chestnut St\nTurn right onto Chestnut St\nDestination will be on the right";
                    case 9:
                        return "Head west on Mulberry St toward Ave A\nSlight right at Ave A\nTurn right toward Mulberry St\nTurn left onto Mulberry St\nTurn left onto Sycamore St\nDestination will be on the left";
                    case 10:
                        return "Head west on Mulberry St toward Ave A\nTurn left onto UNT Shared Pathways\nDestination will be on the right";
                    case 11:
                        return "Head west on Mulberry St\nTurn left\nTurn right\nTurn left";
                    case 12:
                        return "Head west on Mulberry St\nTurn left\nTurn right\nTurn left\nDestination will be on the right";
                    case 13:
                        return "Head west on Mulberry St toward Ave A\nSlight right at Ave A\nTurn right toward Mulberry St\nTurn left onto Mulberry St\nDestination will be on the right";
                    case 14:
                        return "Head west on Mulberry St toward Ave A\nSlight right at Ave A\nTurn left";
                    case 15:
                        return "Head west on Mulberry St toward Ave A\nSlight right at Ave A\nTurn left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn left at Sycamore St\nSlight right onto Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 2:
                switch (dest) {
                    case 1:
                        return "Head southeast\nTurn left toward Mulberry St\nContinue onto Mulberry St\nDestination will be on the right";
                    case 2:
                        return "You are already there";
                    case 3:
                        return "Head northwest\nTurn right toward Hickory St\nTurn left onto Hickory St";
                    case 4:
                        return "Head southeast\nTurn left onto Ave A\nDestination will be on the left";
                    case 5:
                        return "Head northwest\nTurn left\nTurn left\nTurn right\nTurn left\nDestination will be on the right";
                    case 6:
                        return "Head northwest\nTurn left";
                    case 7:
                        return "Head northwest\nSharp right onto Hickory St\nTurn right onto Ave A\nDestination will be on the right";
                    case 8:
                        return "Head northwest\nTurn left\nTurn left\nTurn right\nTurn left\nTurn right toward Chestnut St\nTurn left toward Chestnut St\nTurn right toward Chestnut St\nTurn right onto Chestnut St\nDestination will be on the right";
                    case 9:
                        return "Head northwest\nTurn left\nTurn left toward Mulberry St\nTurn left onto Sycamore St\nDestination will be on the left";
                    case 10:
                        return "Head southeast\nTurn left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nDestination will be on the right";
                    case 11:
                        return "Head southeast\nTurn left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nSlight right\nTurn left\nDestination will be on the right";
                    case 12:
                        return "Head southeast\nTurn right onto UNT Shared Pathways\nSlight right\nDestination will be on the right";
                    case 13:
                        return "Head northwest\nTurn left\nTurn left onto Mulberry St\nDestination will be on the right";
                    case 14:
                        return "Head southeast\nTurn right\nTurn left";
                    case 15:
                        return "Head northwest\nTurn left\nTurn right onto UNT Shared Pathways\nSlight right onto Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 3:
                switch (dest) {
                    case 1:
                        return "Head southeast\nSlight left onto Mulberry St\nTurn right\nTurn left\nContinue onto Mulberry St\nDestination will be on the right";
                    case 2:
                        return "Head southeast\nSlight right toward Mulberry St\nSlight left onto Mulberry St\nTurn right\nDestination will be on the right";
                    case 3:
                        return "You are already there";
                    case 4:
                        return "Head southeast\nSlight right toward Mulberry St\nSlight left onto Mulberry St\nTurn right\nTurn left\nDestination will be on the left";
                    case 5:
                        return "Head southeast\nSlight right toward Mulberry St\nSlight left onto Mulberry St\nTurn right\nTurn left\nTurn right\nDestination will be on the right";
                    case 6:
                        return "Head southeast\nSlight right toward Mulberry St\nSlight left onto Mulberry St\nSlight right\nDestination will be on the left";
                    case 7:
                        return "Head southeast\nSlight right toward Mulberry St\nSlight left onto Mulberry St\nTurn right\nTurn left\nTurn left onto Ave A\nDestination will be on the left";
                    case 8:
                        return "Head southeast toward Sycamore St\nTurn right onto Sycamore St\nTurn right to stay on Sycamore St\nTurn left toward Chestnut St\nTurn left onto Chestnut St\nDestination will be on the left";
                    case 9:
                        return "Head southeast toward Sycamore St\nTurn right onto Sycamore St\nDestination will be on the left";
                    case 10:
                        return "Head southeast\nSlight right toward Mulberry St\nSlight left onto Mulberry St\nTurn right\nTurn left\nTurn right onto UNT Shared Pathways\nDestination will be on the right";
                    case 11:
                        return "Head southeast toward Sycamore St\nTurn right onto Sycamore St\nTurn left onto UNT Shared Pathways\nTurn right\nTurn right\nTurn left\nDestination will be on the right";
                    case 12:
                        return "Head southeast toward Sycamore St\nTurn right onto Sycamore St\nTurn left onto UNT Shared Pathways\nTurn right\nDestination will be on the right";
                    case 13:
                        return "Head southeast\nSlight right toward Mulberry St\nSlight left onto Mulberry St\nDestination will be on the left";
                    case 14:
                        return "Head southeast\nSlight right toward Mulberry St\nSlight left onto Mulberry St\nTurn left\nSlight right";
                    case 15:
                        return "Head southeast toward Sycamore St\nTurn right onto Sycamore St\nTurn right to stay on Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 4:
                switch (dest) {
                    case 1:
                        return "Head east on Mulberry St\nDestination will be on the right";
                    case 2:
                        return "Head west\nTurn right\nDestination will be on the left";
                    case 3:
                        return "Head west\nTurn right toward Hickory St\nTurn left onto Hickory St";
                    case 4:
                        return "You are already there";
                    case 5:
                        return "Head west\nTurn left\nSlight right\nDestination will be on the right";
                    case 6:
                        return "Head west\nTurn right\nDestination will be on the right";
                    case 7:
                        return "Head north on Ave A";
                    case 8:
                        return "Head west\nTurn left\nTurn right toward Chestnut St\nDestination will be on the right";
                    case 9:
                        return "Head west\nTurn left onto Mulberry St\nTurn left onto Sycamore St\nDestination will be on the left";
                    case 10:
                        return "Head southwest on UNT Shared Pathways\nDestination will be on the right";
                    case 11:
                        return "Head southwest on UNT Shared Pathways\nSlight right\nTurn left\nDestination will be on the right";
                    case 12:
                        return "Head southwest on UNT Shared Pathways\nSlight right\nDestination will be on the right";
                    case 13:
                        return "Head west\nTurn right toward Mulberry St\nTurn left onto Mulberry St\nDestination will be on the right";
                    case 14:
                        return "Head west\nTurn left";
                    case 15:
                        return "Head west\nTurn left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn left at Sycamore St\nSlight right onto Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 5:
                switch (dest) {
                    case 1:
                        return "Head northeast\nTurn right toward Mulberry St\nContinue onto Mulberry St\nDestination will be on the right";
                    case 2:
                        return "Head northeast\nTurn left\nTurn right\nDestination will be on the right";
                    case 3:
                        return "Head northeast\nTurn left toward Mulberry St\nSlight right at Sycamore St\nSlight right";
                    case 4:
                        return "Head northeast\nTurn right onto Ave A\nDestination will be on the left";
                    case 5:
                        return "You are already there";
                    case 6:
                        return "Head northeast\nTurn left\nDestination will be on the right";
                    case 7:
                        return "Head northeast\nTurn right toward Ave A\nTurn left onto Ave A\nDestination will be on the left";
                    case 8:
                        return "Head south toward UNT Shared Pathways\nTurn right onto Chestnut St\nDestination will be on the right";
                    case 9:
                        return "Head south toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn right onto Sycamore St\nDestination will be on the right";
                    case 10:
                        return "Head northeast\nTurn left toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nDestination will be on the left";
                    case 11:
                        return "Head northeast\nTurn right toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn left\nDestination will be on the right";
                    case 12:
                        return "Head northeast\nTurn left onto UNT Shared Pathways\nTurn right\nDestination will be on the right";
                    case 13:
                        return "Head northeast\nTurn right toward Mulberry St\nTurn left onto Mulberry St\nDestination will be on the right";
                    case 14:
                        return "Head northeast\nTurn left\nSlight right";
                    case 15:
                        return "Turn right onto UNT Shared Pathways\nTurn left at Sycamore St\nSlight right onto Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 6:
                switch (dest) {
                    case 1:
                        return "Head southeast on Ave A toward Mulberry St\nTurn left onto Mulberry St\nDestination will be on the right";
                    case 2:
                        return "Head north on Ave A toward Hickory St\nTurn left onto Hickory St\nTurn left\nDestination will be on the right";
                    case 3:
                        return "Head north on Ave A toward Hickory St\nTurn left onto Hickory St";
                    case 4:
                        return "Head southeast on Ave A toward Mulberry St";
                    case 5:
                        return "Head southeast on Ave A toward Mulberry St\nTurn right at Mulberry St\nSlight right\nDestination will be on the right";
                    case 6:
                        return "You are already there";
                    case 7:
                        return "Head southeast on Ave A toward Mulberry St\nDestination will be on the right";
                    case 8:
                        return "Head southeast on Ave A toward Mulberry St\nTurn right at Mulberry St\nTurn left\nTurn right onto Chestnut St\nDestination will be on the right";
                    case 9:
                        return "Head north on Ave A toward Hickory St\nTurn left onto Hickory St\nTurn left onto Mulberry St\nTurn left onto Sycamore St\nDestination will be on the left";
                    case 10:
                        return "Head southeast on Ave A toward Mulberry St\nSlight right onto UNT Shared Pathways\nDestination will be on the right";
                    case 11:
                        return "Head southeast on Ave A toward Mulberry St\nSlight right onto UNT Shared Pathways\nSlight right\nTurn left\nDestination will be on the right";
                    case 12:
                        return "Head southeast on Ave A toward Mulberry St\nSlight right onto UNT Shared Pathways\nSlight right\nDestination will be on the right";
                    case 13:
                        return "Head north on Ave A toward Hickory St\nTurn left onto Hickory St\nTurn right toward Mulberry St\nTurn left onto Mulberry St\nDestination will be on the right";
                    case 14:
                        return "Head southeast on Ave A toward Mulberry St\nTurn right at Mulberry St\nTurn left";
                    case 15:
                        return "Head southeast on Ave A toward Mulberry St\nTurn right at Mulberry St\nTurn right onto UNT Shared Pathways\nTurn left at Sycamore St\nSlight right onto Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 7:
                switch (dest) {
                    case 1:
                        return "Head south on Ave A toward Mulberry St\nTurn left onto Mulberry St\nDestination will be on the right";
                    case 2:
                        return "Head north on Ave A toward Hickory St\nTurn left onto Hickory St\nTurn left\nDestination will be on the right";
                    case 3:
                        return "Head north on Ave A toward Hickory St\nTurn left onto Hickory St";
                    case 4:
                        return "Head south on Ave A toward Mulberry St";
                    case 5:
                        return "Head south on Ave A toward Mulberry St\nTurn right at Mulberry St\nTurn left\nSlight right\nDestination will be on the right";
                    case 6:
                        return "Head north on Ave A toward Hickory St\nTurn left onto Hickory St\nSlight left";
                    case 7:
                        return "You are already there";
                    case 8:
                        return "Head south on Ave A toward Mulberry St\nTurn right at Mulberry St\nTurn left\nTurn right toward Chestnut St\nTurn right onto Chestnut St\nDestination will be on the right";
                    case 9:
                        return "Head south on Ave A toward Mulberry St\nTurn right toward Mulberry St\nTurn left onto Sycamore St\nDestination will be on the left";
                    case 10:
                        return "Head south on Ave A toward Mulberry St\nSlight right onto UNT Shared Pathways\nDestination will be on the right";
                    case 11:
                        return "Head south on Ave A toward Mulberry St\nSlight right onto UNT Shared Pathways\nSlight right\nTurn left\nDestination will be on the right";
                    case 12:
                        return "Head south on Ave A toward Mulberry St\nSlight right onto UNT Shared Pathways\nSlight right\nDestination will be on the right";
                    case 13:
                        return "Head south on Ave A toward Mulberry St\nTurn right at Mulberry St\nTurn right toward Mulberry St\nTurn left onto Mulberry St\nDestination will be on the right";
                    case 14:
                        return "Head south on Ave A toward Mulberry St\nTurn right at Mulberry St\nTurn left";
                    case 15:
                        return "Head south on Ave A toward Mulberry St\nTurn right at Mulberry St\nTurn right onto UNT Shared Pathways\nSlight right onto Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 8:
                switch (dest) {
                    case 1:
                        return "Head east\nTurn left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn left\nTurn right toward Mulberry St\nContinue onto Mulberry St\nDestination will be on the right";
                    case 2:
                        return "Head east\nTurn right\nDestination will be on the right";
                    case 3:
                        return "Head west toward Sycamore St\nTurn right at Sycamore St\nSlight left onto Sycamore St\nTurn left at Mulberry St\nSlight right";
                    case 4:
                        return "Head east\nTurn left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn left toward Ave A\nTurn right onto Ave A\nDestination will be on the left";
                    case 5:
                        return "Head east\nTurn left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn left\nDestination will be on the left";
                    case 6:
                        return "Head east\nTurn left toward Mulberry St\nSlight right toward Mulberry St\nTurn right onto Mulberry St\nSlight right\nDestination will be on the left";
                    case 7:
                        return "Head east\nTurn right onto UNT Shared Pathways\nTurn left\nTurn left onto Ave A\nDestination will be on the left";
                    case 8:
                        return "You are already there";
                    case 9:
                        return "Head west toward Sycamore St\nTurn right at Sycamore St\nSlight left onto Sycamore St\nDestination will be on the right";
                    case 10:
                        return "Head east\nTurn right onto UNT Shared Pathways\nTurn left toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nDestination will be on the left";
                    case 11:
                        return "Head east\nTurn left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn right\nTurn left\nDestination will be on the right";
                    case 12:
                        return "Head east\nTurn left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn right\nTurn right\nDestination will be on the right";
                    case 13:
                        return "Head east\nTurn left toward Mulberry St\nSlight right toward Mulberry St\nTurn left onto Mulberry St\nDestination will be on the right";
                    case 14:
                        return "Head east\nTurn left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn right";
                    case 15:
                        return "Head west toward Sycamore St\nTurn left onto Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 9:
                switch (dest) {
                    case 1:
                        return "Head north on Sycamore St toward Mulberry St\nTurn left\nContinue onto Mulberry St\nDestination will be on the right";
                    case 2:
                        return "Head north on Sycamore St toward Mulberry St\nTurn right onto Mulberry St\nTurn right\nDestination will be on the right";
                    case 3:
                        return "Head north on Sycamore St toward Mulberry St\nTurn left at Mulberry St\n\nSlight right";
                    case 4:
                        return "Head north on Sycamore St toward Mulberry St\nTurn right onto Mulberry St\nTurn right\nTurn left\nDestination will be on the left";
                    case 5:
                        return "Head south on Sycamore St toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn left\nDestination will be on the left";
                    case 6:
                        return "Head north on Sycamore St toward Mulberry St\nTurn right onto Mulberry St\nSlight right\nDestination will be on the left";
                    case 7:
                        return "Head north on Sycamore St toward Mulberry St\nTurn right onto Mulberry St\nTurn right\nTurn left\nTurn left onto Ave A\nDestination will be on the left";
                    case 8:
                        return "Head south on Sycamore St toward UNT Shared Pathways\nTurn right to stay on Sycamore St\nTurn left toward Chestnut St\nTurn left onto Chestnut St\nDestination will be on the left";
                    case 9:
                        return "You are already there";
                    case 10:
                        return "Head north on Sycamore St toward Mulberry St\nTurn right onto Mulberry St\nTurn right\nTurn left\nTurn right onto UNT Shared Pathways\nDestination will be on the right";
                    case 11:
                        return "Head south on Sycamore St toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn left\nDestination will be on the right";
                    case 12:
                        return "Head south on Sycamore St toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn right\nDestination will be on the right";
                    case 13:
                        return "Head north on Sycamore St toward Mulberry St\nTurn right onto Mulberry St\nDestination will be on the left";
                    case 14:
                        return "Head south on Sycamore St toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn left\nTurn right";
                    case 15:
                        return "Head south on Sycamore St toward UNT Shared Pathways\nTurn right to stay on Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 10:
                switch (dest) {
                    case 1:
                        return "Head north on UNT Shared Pathways toward Mulberry St\nTurn right onto Mulberry St\nDestination will be on the right";
                    case 2:
                        return "Head north on UNT Shared Pathways toward Mulberry St\nTurn left at Mulberry St\nTurn right\nDestination will be on the left";
                    case 3:
                        return "Head north on UNT Shared Pathways toward Mulberry St\nTurn right toward Hickory St";
                    case 4:
                        return "Head north on UNT Shared Pathways toward Mulberry St\nDestination will be on the left";
                    case 5:
                        return "Head south on UNT Shared Pathways\nTurn right toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn right\nTurn left\nDestination will be on the right";
                    case 6:
                        return "Head north on UNT Shared Pathways toward Mulberry St\nTurn left at Mulberry St\nTurn right\nDestination will be on the right";
                    case 7:
                        return "Head north on UNT Shared Pathways toward Mulberry St\nSlight left onto Ave A\nDestination will be on the left";
                    case 8:
                        return "Head south on UNT Shared Pathways\nTurn right\nSlight left at UNT Shared Pathways\nSlight left toward Chestnut St\nTurn right onto Chestnut St\nDestination will be on the right";
                    case 9:
                        return "Head north on UNT Shared Pathways toward Mulberry St\nTurn right toward Mulberry St\nTurn left onto Sycamore St\nDestination will be on the left";
                    case 10:
                        return "You are already there";
                    case 11:
                        return "Head south on UNT Shared Pathways\nSlight right\nTurn left\nDestination will be on the right";
                    case 12:
                        return "Head south on UNT Shared Pathways\nSlight right\nDestination will be on the right";
                    case 13:
                        return "Head north on UNT Shared Pathways toward Mulberry St\nTurn left onto Mulberry St\nDestination will be on the right";
                    case 14:
                        return "Head south on UNT Shared Pathways\nTurn right\nSlight left at UNT Shared Pathways\nTurn right";
                    case 15:
                        return "Head south on UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn left at Sycamore St\nSlight right onto Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 11:
                switch (dest) {
                    case 1:
                        return "Head north\nTurn right toward Mulberry St\nTurn right onto Mulberry St\nDestination will be on the right";
                    case 2:
                        return "Head northwest\nTurn right onto UNT Shared Pathways\nTurn right\nDestination will be on the left";
                    case 3:
                        return "Head northwest\nSlight right toward UNT Shared Pathways\nTurn right onto Sycamore St\nTurn left at Mulberry St\nSlight right";
                    case 4:
                        return "Head northwest\nTurn right onto UNT Shared Pathways\nDestination will be on the left";
                    case 5:
                        return "Head northwest\nSlight right toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn right\nTurn left\nDestination will be on the right";
                    case 6:
                        return "Head northwest\nTurn left onto UNT Shared Pathways\nTurn right\nDestination will be on the right";
                    case 7:
                        return "Head northwest\nTurn right onto UNT Shared Pathways\nSlight left onto Ave A\nDestination will be on the left";
                    case 8:
                        return "Head south\nTurn right\nSlight left toward Chestnut St\nTurn right onto Chestnut St\nDestination will be on the right";
                    case 9:
                        return "Head northwest\nTurn right toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn right onto Sycamore St\nDestination will be on the right";
                    case 10:
                        return "Head northwest\nSlight right onto UNT Shared Pathways\nDestination will be on the left";
                    case 11:
                        return "You are already there";
                    case 12:
                        return "Head northwest\nTurn left\nDestination will be on the right";
                    case 13:
                        return "Head northwest\nTurn left onto UNT Shared Pathways\nTurn right toward Mulberry St\nTurn left onto Mulberry St\nDestination will be on the right";
                    case 14:
                        return "Head south\nTurn right\nSlight left\nSlight left toward Chestnut St\nTurn right onto Chestnut St\nDestination will be on the right";
                    case 15:
                        return "Head northwest\nTurn right toward UNT Shared Pathways\nTurn left toward UNT Shared Pathways\nSlight right toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn left at Sycamore St\nSlight right onto Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 12:
                switch (dest) {
                    case 1:
                        return "Head north\nTurn right toward Mulberry St\nTurn left toward Mulberry St\nTurn right onto Mulberry St\nDestination will be on the right";
                    case 2:
                        return "Head north toward UNT Shared Pathways\nContinue onto UNT Shared Pathways\nTurn left at Mulberry St\nTurn right\nDestination will be on the left";
                    case 3:
                        return "Head north\nTurn left toward UNT Shared Pathways\nSlight right toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn right onto Sycamore St\nTurn left at Mulberry St\nSlight right";
                    case 4:
                        return "Head north toward UNT Shared Pathways\nContinue onto UNT Shared Pathways\nDestination will be on the left";
                    case 5:
                        return "Head north\nTurn left toward UNT Shared Pathways\nSlight right toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn right\nTurn left\nDestination will be on the right";
                    case 6:
                        return "Head north\nTurn left toward UNT Shared Pathways\nSlight right toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn right\nTurn left\nTurn right\nDestination will be on the right";
                    case 7:
                        return "Head north toward UNT Shared Pathways\nContinue onto UNT Shared Pathways\nSlight left onto Ave A\nDestination will be on the left";
                    case 8:
                        return "Head south\nTurn right\nSlight left\nSlight left toward Chestnut St\nTurn right onto Chestnut St\nDestination will be on the right";
                    case 9:
                        return "Head north\nTurn left toward UNT Shared Pathways\nSlight right toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn right onto Sycamore St\nDestination will be on the right";
                    case 10:
                        return "Head north toward UNT Shared Pathways\nContinue onto UNT Shared Pathways\nDestination will be on the left";
                    case 11:
                        return "Head north\nTurn right\nDestination will be on the right";
                    case 12:
                        return "You are already there";
                    case 13:
                        return "Head north\nTurn left toward UNT Shared Pathways\nSlight right toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn right toward Mulberry St\nTurn left toward Mulberry St\nTurn right toward Mulberry St\nTurn left onto Mulberry St\nDestination will be on the right";
                    case 14:
                        return "Head south\nTurn right\nTurn right\nTurn left";
                    case 15:
                        return "Head north\nTurn left toward UNT Shared Pathways\nSlight right toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn left at Sycamore St\nSlight right onto Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 13:
                switch (dest) {
                    case 1:
                        return "Head east on Mulberry St\nTurn right\nTurn left\nContinue onto Mulberry St\nDestination will be on the right";
                    case 2:
                        return "Head east on Mulberry St\nTurn right\nTurn right\nTurn right\nDestination will be on the right";
                    case 3:
                        return "Head west on Mulberry St toward Sycamore St\nSlight right at Sycamore St\nSlight right";
                    case 4:
                        return "Head east on Mulberry St\nTurn right\nTurn left\nDestination will be on the left";
                    case 5:
                        return "Head east on Mulberry St\nTurn right\nTurn left\nTurn right\nDestination will be on the right";
                    case 6:
                        return "Head east on Mulberry St toward S Ave B\nSlight right\nDestination will be on the left";
                    case 7:
                        return "Head east on Mulberry St\nTurn right\nTurn left\nTurn left onto Ave A\nDestination will be on the left";
                    case 8:
                        return "Head west on Mulberry St toward Sycamore St\nTurn left onto Sycamore St\nDestination will be on the left";
                    case 9:
                        return "Head west on Mulberry St toward Sycamore St\nTurn left onto Sycamore St\nDestination will be on the left";
                    case 10:
                        return "Head east on Mulberry St\nTurn right\nTurn left\nTurn right onto UNT Shared Pathways\nDestination will be on the right";
                    case 11:
                        return "Head east on Mulberry St\nTurn right\nTurn left\nTurn right toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn right\nTurn right\nTurn left\nDestination will be on the right";
                    case 12:
                        return "Head east on Mulberry St\nTurn right\nTurn left\nTurn right toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nTurn right\nTurn right\nDestination will be on the right";
                    case 13:
                        return "You are already there";
                    case 14:
                        return "Head east on Mulberry St\nTurn right\nTurn left\nTurn right\nTurn left\nSlight right";
                    case 15:
                        return "Head west on Mulberry St toward Sycamore St\nTurn left onto Sycamore St\nTurn right to stay on Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 14:
                switch (dest) {
                    case 1:
                        return "Head south on Chestnut St\nTurn left\nTurn left\nTurn right\nTurn left\nTurn right toward Mulberry St\nContinue onto Mulberry St\nDestination will be on the right";
                    case 2:
                        return "Head south on Chestnut St\nTurn left\nTurn left\nTurn right\nTurn left\nTurn right\nTurn left\nTurn right\nTurn right\nDestination will be on the right";
                    case 3:
                        return "Head west on Chestnut St\nTurn right toward Sycamore St\nTurn right onto Sycamore St\nTurn left to stay on Sycamore St\nTurn left at Mulberry St\nSlight right";
                    case 4:
                        return "Head south on Chestnut St\nTurn left\nTurn left\nTurn right toward Ave A\nTurn left toward Ave A\nTurn right onto Ave A\nDestination will be on the left";
                    case 5:
                        return "Head south on Chestnut St\nTurn right\nTurn left\nDestination will be on the left";
                    case 6:
                        return "Head south on Chestnut St\nTurn left\nTurn left\nSlight right toward Mulberry St\nTurn right onto Mulberry St\nSlight right\nDestination will be on the left";
                    case 7:
                        return "Head south on Chestnut St\nTurn left\nTurn left\nTurn right\nTurn left\nTurn right toward Ave A\nTurn left onto Ave A\nDestination will be on the left";
                    case 8:
                        return "Head south on Chestnut St\nTurn left\nTurn left\nTurn left\nDestination will be on the left";
                    case 9:
                        return "Head west on Chestnut St\nTurn right toward Sycamore St\nTurn right onto Sycamore St\nTurn left to stay on Sycamore St\nDestination will be on the right";
                    case 10:
                        return "Head south on Chestnut St\nTurn left\nTurn right toward UNT Shared Pathways\nTurn left toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nDestination will be on the left";
                    case 11:
                        return "Head south on Chestnut St\nTurn left\nTurn left\nTurn right\nTurn left\nDestination will be on the right";
                    case 12:
                        return "Head south on Chestnut St\nTurn left\nTurn left\nDestination will be on the left";
                    case 13:
                        return "Head south on Chestnut St\nTurn left\nTurn left\nSlight right toward Mulberry St\nTurn left onto Mulberry St\nDestination will be on the right";
                    case 14:
                        return "You are already there";
                    case 15:
                        return "Head west on Chestnut St\nTurn right toward Sycamore St\nTurn left onto Sycamore St\nDestination will be on the right";
                    default:
                        return "Invalid destination";
                }

            case 15:
                switch (dest) {
                    case 1:
                        return "Head east on Sycamore St\nSlight left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn left\nTurn right\nTurn left\nTurn right\nTurn right\nDestination will be on the right";
                    case 2:
                        return "Head east on Sycamore St\nSlight left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn left\nTurn right\nTurn left\nTurn right\nTurn right\nDestination will be on the right";
                    case 3:
                        return "Head east on Sycamore St\nTurn left to stay on Sycamore St\n420 ft\nTurn left at Mulberry St\nSlight right";
                    case 4:
                        return "Head east on Sycamore St\nSlight left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn left toward Ave A\nTurn right onto Ave A\nDestination will be on the left";
                    case 5:
                        return "Head east on Sycamore St\nSlight left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn left\nDestination will be on the left";
                    case 6:
                        return "Head east on Sycamore St\nTurn right onto Mulberry St\nSlight right\nDestination will be on the left";
                    case 7:
                        return "Head east on Sycamore St\nSlight left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn left\nTurn right toward Ave A\nTurn left onto Ave A\nDestination will be on the left";
                    case 8:
                        return "Head east on Sycamore St\nTurn right toward Chestnut St\nTurn left onto Chestnut St\nDestination will be on the left";
                    case 9:
                        return "Head east on Sycamore St\nTurn left to stay on Sycamore St\nDestination will be on the right";
                    case 10:
                        return "Head east on Sycamore St\nSlight left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn left toward UNT Shared Pathways\nTurn left onto UNT Shared Pathways\nDestination will be on the left";
                    case 11:
                        return "Head east on Sycamore St\nSlight left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn right\nTurn right\nTurn left\nDestination will be on the right";
                    case 12:
                        return "Head east on Sycamore St\nSlight left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn right\nDestination will be on the right";
                    case 13:
                        return "Head east on Sycamore St\nTurn right onto Mulberry St\nDestination will be on the left";
                    case 14:
                        return "Head east on Sycamore St\nSlight left toward UNT Shared Pathways\nTurn right onto UNT Shared Pathways\nTurn right\nTurn left\nTurn right";
                    case 15:
                        return "You are already there";
                    default:
                        return "Invalid destination";
                }

            default:
                return "Invalid source";
        }
    }
}
