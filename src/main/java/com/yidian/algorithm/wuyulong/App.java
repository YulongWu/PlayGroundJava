package com.yidian.algorithm.wuyulong;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//third-party libs
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.Gson;


/**
 * Created by frankie_yd1 on 9/14/15.
 */
public class App {
    static class Demo {
        String str;
        int it;
        public Demo(String str, int it) {
            this.str = str;
            this.it = it;
        }
    }

    public static void main(String[] args) {
        /**
         * 将一段话中第一次和最后一次高亮的keyword位置高亮
         */
        /*
        String string7 = "javajava";
        System.out.println(string7.lastIndexOf('a'));//1
        System.out.println(string7.lastIndexOf('a', 2));//3
        System.out.println(string7.lastIndexOf("java"));//0
        System.out.println(string7.lastIndexOf("java", 2));//4

        String content = "<body><p><span>今年两会，转基因食品成了最热话题，崔永元也成了最热话题中不得不提的一个人物崔永元。";
        List<String> sls_list = Arrays.asList("转基因", "许戈辉", "崔永元");
        System.out.println(String.format("index of %s is %d", sls_list.get(2), content.indexOf(sls_list.get(2))));
        System.out.println(String.format("last index of %s is %d", sls_list.get(2), content.lastIndexOf(sls_list.get(2))));
        System.out.println(content);
        for (int i = 0; i != sls_list.size(); i++) {
            String key = sls_list.get(i).replace("^^", "");
            System.out.println(String.format("index of %s is %d", key, content.indexOf(key)));
            System.out.println(String.format("last index of %s is %d", key, content.lastIndexOf(key)));
            content = content.replaceFirst(key, String.format("<font style='color:green'><a name=%d> %s </a></font>", i + 1, key));
            //replace the last occurence
            int index = -1;
            if (content.indexOf(key) > -1 && content.indexOf(key)+12 < content.length()) {
                index = content.substring(content.indexOf(key) + 12).lastIndexOf(key);
                if (index > -1)
                    index += content.indexOf(key) + 12;
            }
            //Yulong added for debug
            System.out.println(String.format("last index of %s is %d", key, index));
            //added end
            if (index > -1)
                content = new StringBuilder(content).replace(index, index + key.length(),
                        String.format("<font style='color:green'><a name=%d> %s </a></font>", i+1, key)).toString();
            System.out.println(content);

        }
        */

        /**
         * 测试Java中各种打印异常信息的方法
         */
        /*
        try {
            throw new Exception("Test exception.");
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println("----------");
            System.out.println(e.getCause());
            System.out.println("----------");
            System.out.println(e.getMessage());
            System.out.println("----------");
            System.out.println(e.getStackTrace());
            System.out.println("----------");
            System.out.println(e.toString());
            System.out.println("----------");
            e.printStackTrace(System.out);
        }
        */
        /**
         * 测试Arrays.asList()方法的范型指示方式
         */
        /*
        List<Integer> list = Arrays.<Integer>asList(1,2);
        //Following won't compile
        //List<Integer> list = Arrays.asList<Integer>(1,2);
        */
        /**
         * 测试List, Pair对象和打印方式
         */
        /*
        List<Pair<String, Double>> list = new ArrayList();
        list.add(new Pair<String, Double>("k1", 1.0));
        list.add(new Pair<String, Double>("k2", 2.0));
        System.out.println(list);
        */
        /**
         * 测试fastjson
         */
        /*
         class User {
             @JSONField(name = "idabc")
            private Long id;
            private String name;

            public Long getId() { return id; }
            public void setId(Long id) { this.id = id; }

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }
        }
        class Group {
            @JSONField(name = "idabc")
            private Long id;
            private String name;
            @JSONField(name = "usersabc")
            private List<User> users = new ArrayList<User>();

            public Long getId() { return id; }
            public void setId(Long id) { this.id = id; }

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public List<User> getUsers() { return users; }
            public void setUsers(List<User> users) { this.users = users; }
        }
        Group group = new Group();
        group.setId(0L);
        group.setName("admin");

        User guestUser = new User();
        guestUser.setId(2L);
        guestUser.setName("guest");

        User rootUser = new User();
        rootUser.setId(3L);
        rootUser.setName("root");

        group.getUsers().add(guestUser);
        group.getUsers().add(rootUser);

        String jsonString = JSON.toJSONString(group);

        System.out.println(jsonString);
*/
        /**
         * 测试gson
         */
        /*
        class User {
            private Long id;
            private String name;

            public Long getId() { return id; }
            public void setId(Long id) { this.id = id; }

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }
        }
       class Group {
            private Long id;
            private String name;
            private List<User> users = new ArrayList<User>();

            public Long getId() { return id; }
            public void setId(Long id) { this.id = id; }

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public List<User> getUsers() { return users; }
            public void setUsers(List<User> users) { this.users = users; }
        }

        Group group = new Group();
        group.setId(0L);
        group.setName("admin");

        User guestUser = new User();
        guestUser.setId(2L);
        guestUser.setName("guest");

        User rootUser = new User();
        rootUser.setId(3L);
        rootUser.setName("root");

        group.getUsers().add(guestUser);
        group.getUsers().add(rootUser);

        Gson gson = new Gson();
        String jsonString = gson.toJson(group);

        System.out.println(jsonString);
        System.out.println(gson.toJson(new Demo("demo", 1)));
        */
        /**
         * 测试在长时文件对象打开中删除对应文件，后续写入是否报错
         * 结论：由于linux会将进程的写入数据先行缓存，所以文件被删后JAVA的确不会报错
         */

        String input = "";
        FileWriter fw = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            fw = new FileWriter("output.txt");
            while (!input.equals("stop")) {
                input = br.readLine();
                fw.write(input);
                fw.write("\n");
                fw.flush();

                System.out.println("" + input + "\n");
                if(input.equals("throw"))
                    throw new IOException("test");
            }
        }catch(IOException e) {
            System.out.println(e);
        }finally {
            if(fw != null)
                try {
                    System.out.println("closing...");
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }
}
