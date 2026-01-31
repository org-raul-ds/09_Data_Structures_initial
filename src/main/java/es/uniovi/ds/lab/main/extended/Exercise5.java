package es.uniovi.ds.lab.main.extended;

import static es.uniovi.ds.lab.operations.Disk.*;
import static es.uniovi.ds.lab.util.Util.*;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        var vector = vectorOf("Victor", "Valentin", "Vidal", "Viviana");
        var linkedList = linkedListOf("Lucas", "Leandro", "Lorenzo", "Luis");

        // 1. Buscar en el vector el primer nombre de cinco letras (length() == 5)

        // 2. Buscar en la lista enlazada el primer nombre cuya segunda letra sea una 'e' (charAt(1) == 'e')

        // 3. Buscar en "file.txt" el primer nombre que empiece por "Fu" (startsWith("Fu"))

    }
}
