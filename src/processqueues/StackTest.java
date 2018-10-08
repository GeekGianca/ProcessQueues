/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processqueues;

import com.gksoftware.processqueues.queues.Queue;
import com.gksoftware.processqueues.queues.PriorityQueue;
import javax.swing.JOptionPane;

/**
 *
 * @author Geek-Programmer
 */
public class StackTest {

    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("===== IMPLEMENTACIÓN DE COLAS - OPCIÓN DEL MENÚ ===== \n\n"
                    + "1. Agregar Proceso a la Cola \n"
                    + "2. Atender Proceso de la Cola \n"
                    + "3. Mostrar procesos de la Cola \n"
                    + "4. Mostrar Procesos Atendidos \n"
                    + "5. Salir"
                    + "\n \n Seleccione una opción del 1 al 5"));
        } while (opcion <= 0 || opcion > 5);
        return opcion;
    }

    /*public static void mostrarCola(StackClass stack) {
        StackClass temp = new StackClass();
        //Se crea un nuevo objeto de la clase cola.         
        //variable tipo cadena vacía para almacenar los datos.         
        while (!stack.isEmpty()) {
            //Mientras la cola no este vacía se muestran sus datos.             
            System.out.println(String.valueOf("---- " + stack.peek().toString()));
            temp.push(stack.peek());
            //Se agrega el elemento del frente a una cola temporal.             
            stack.pop();
            //Luego se quita el elemento del frente de la cola actual.         
        }
        while (!temp.isEmpty()) {
            //Se pasan los datos a la cola temporal a la original.             
            stack.push(temp.peek());
            System.out.println(temp.peek().toString());
            temp.pop();
        }
    }*/

    public static void loadProcess(ProcessT processT) {
        processT.setPid(String.valueOf(System.nanoTime()));
        processT.setName("Process_" + System.nanoTime());
        processT.setPriority((int) (Math.random() * 3));
        processT.setCharacters("Process Executable");
        processT.setCurrentQuantum(5);
        processT.setCurrentBurst(10);
        processT.setCurrentTurnaround(15);
        processT.setCurrentEndTime(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue obj = new PriorityQueue();
        Queue obj2 = new Queue();
        ProcessT processT1 = new ProcessT();
        loadProcess(processT1);
        ProcessT processT2 = new ProcessT();
        loadProcess(processT2);
        ProcessT processT3 = new ProcessT();
        loadProcess(processT3);
        ProcessT processT4 = new ProcessT();
        loadProcess(processT4);
        ProcessT processT5 = new ProcessT();
        loadProcess(processT5);
        String pid = processT3.getPid();
        //obj.push(processT1.getPriority(), processT1, processT1.getPid());
        //obj.push(processT2.getPriority(), processT2, processT2.getPid());
        //obj.push(processT3.getPriority(), processT3, processT3.getPid());
//        obj.push(processT4.getPriority(), processT4, processT4.getPid());
//        obj.push(processT5.getPriority(), processT5, processT5.getPid());
        obj2.push(processT1);
        obj2.push(processT2);
        obj2.push(processT3);
        obj2.push(processT4);
        obj2.push(processT5);
        
        System.out.println("Print Objects");
        System.out.println(obj2);
        
        System.out.println("Print Objects By Pop");
        //obj.remove(pid);
        obj2.pop();
        System.out.println(obj2);
        
        //changeCharacters("Buscando soluciones para encontrar respuestas a muchas preguntas", 5);
        /*StackClass stack = new StackClass();
        StackClass stackE = new StackClass();
        ProcessT process;
        int opcion;
        do
        {
            opcion = menu();
            switch (opcion)
            {
                case 1:
                    process = new ProcessT();
                    loadProcess(process);
                    System.out.println("Process: "+process.toString());
                    stack.push(process);
                    break;
                case 2:
                    if (!stack.isEmpty())
                    {
                        ProcessT processt = stack.peek();
                        System.out.println("Process Pop: "+processt.toString());
                        stackE.push(processt);
                        System.out.println("Process Attended: "+stackE.peek());
                        stack.pop();

                    } else
                    {
                        System.out.println("Invalid operation");
                    }
                    break;
                case 3:
                    mostrarCola(stack);
                    break;
                case 4:
//                    cola.limpiarCola();
//                    JOptionPane.showMessageDialog(null, "============ IMPLEMENTACIÓN DE COLAS ============" + "\n\n" + "La cola está vacía, No pueden quitar datos \n\n");
                    mostrarCola(stackE);
                    break;
                case 5:
                    break;
            }
        } while (opcion != 5);*/
    }

    public static String changeCharacters(String characters, int pos) {
        String newcharacter = characters;
        System.out.println(characters.subSequence(0, pos - 1) + "x" + characters.substring(pos, characters.length()));
        if (pos <= characters.length()) {
            int burst = getBurst(characters, 'a');
            System.out.println("Coincidencias: " + burst);
            System.out.println("Indice Inicial: " + pos);
            newcharacter = characters.subSequence(0, pos - 1) + "x" + characters.substring(pos, characters.length());
        }
        return newcharacter;
    }

    private static int getBurst(String characters, char character) {
        int position = 0;
        int counter = 0;
        position = characters.toLowerCase().indexOf(character);
        while (position != -1) {
            counter++;
            position = characters.toLowerCase().indexOf(character, position + 1);
        }
        return counter;
    }

}
