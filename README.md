# 📦 Web II Fetch Project

### Web Programming II - Day 47

- 📌 ***This project is maintained in the [`backend`](https://github.com/NetBeans-Projects/Web-II-Fetch/tree/backend) branch. Please switch to that branch to view the code.***

This is a simple Java EE (Servlet-based) web application that demonstrates how to make an asynchronous request using the JavaScript fetch() API to communicate with a Java servlet.

---

## 📁 Project Structure

```directory

Web II Fetch/
|
├── Web Pages/
│   ├── index.html
│   └── assets/
│       └── js/
│           └── script.js
|
├── Source Packages/
│   └── controller/
│       └── FetchController.java
│
├── Libraries/
├── Configuration Files/

```

---

## 🚀 Features

* `index.html`: Main frontend file

* `script.js`: Contains JavaScript code using `fetch()` to call backend

* `FetchController.java`: Java Servlet that handles backend requests

* Uses standard Java EE structure (suitable for NetBeans or similar IDEs)

## 🔧 How to Run

|* Open the project in NetBeans or any IDE that supports Java EE.

* Right-click the project > Run to start the web server (GlassFish, Tomcat, etc.).

* Access the app in the browser:
`http://localhost:8080/Web%20II%20Fetch/`

* Open the browser console to see the output from the `fetch()` request.

---

## 📜 Example `fetch()` Usage

In `script.js`:

```javascript

async function submitData() {

    try {
        const response = await fetch("FetchController");
        if (response.ok) {
            const data = await response.text();
            console.log(data);
        } else {
            console.log("Error:", response.status);
        }
    } catch (error) {
        console.log("Fetch error:", error);
    }

}

```

---

## 📬 Servlet Example

In `FetchController.java`:

```java

@WebServlet("/FetchController")
public class FetchController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/plain");
        response.getWriter().write("Data received from FetchController!");

    }

}

```

---

## 📞 Contact
For questions or improvements, feel free to open an issue or contact [Jude Thamel](https://github.com/JudeThamel).

---

## License

This project is licensed under **JudeThamel License v1.0**.  
Only personal and educational use is allowed. Commercial or modified use is strictly prohibited without written permission.

[View Full License](./LICENSE)

