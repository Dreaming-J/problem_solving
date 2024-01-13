# 문제 풀이
사용 언어: JAVA 17

### 입력받는 법
```java
public class Problem {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 숫자 입력
        int num = Integer.parseInt(br.readLine());
        
        // 문자 입력
        String input = br.readLine();
        
        // 여러 숫자 입력
        List<Integer> nums = Stream.of(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        
        // 여러 입력
        // ex) kim jong heon
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken(); //kim
        String b = st.nextToken(); //jong
        String c = st.nextToken(); //heon
    }
}
```