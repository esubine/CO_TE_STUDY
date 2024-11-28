package hansol.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Boj_2161 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i=0; i < n ; i++){
            queue.offerLast(i+1);
        }


        while (!queue.isEmpty()){
            sb.append(queue.pop()).append(" ");
            if (queue.isEmpty())break;
            queue.offerLast(queue.pop());
        }

        System.out.println(sb);




    }

}
