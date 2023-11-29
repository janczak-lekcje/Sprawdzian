package workshop;

import java.util.ArrayList;
import java.util.List;

class Worker {
    void start() {
        Tool Dynamometr = new Tool("Dynamometr");
        Tool młotek = new Tool("młotek");

        młotek.useTool();
        List<Tool> tools = new ArrayList<>();
        tools.add(new Tool("Śrubokret"));
        tools.add(new Tool("Klucz Francuski"));

        for (Tool tool : tools) {
            tool.useTool();
        }
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start();
    }
}