package es.uniovi.ds.lab.operations;

import es.uniovi.ds.lab.structures.MyLinkedList;

public class HtmlGenerator {
    public static void writeHTML(MyLinkedList linked) {

        System.out.println("------------------------------------------------");
        System.out.println("<html>");
        System.out.println("  <body>");
        System.out.println("    <ul>");

        for (int i = 0; i < linked.size(); i++)
            System.out.println("      <li>" + linked.getString(i) + "</li>");

        System.out.println("    </ul>");
        System.out.println("  </body>");
        System.out.println("</html>");
    }
}
