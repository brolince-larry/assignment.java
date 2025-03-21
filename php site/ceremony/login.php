<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <style>
        body {
            /* Linear gradient background */
            background: linear-gradient(orange, white,yellow);
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .login-container {
            background: linear-gradient(BLUE, white,purples);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }
        .login-container h2 {
            margin-bottom: 20px;
        }
        .login-container label {
            display: block;
            margin-bottom: 5px;
            text-align: left;
        }
        .login-container input[type="text"], .login-container input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .login-container input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            border: none;
            border-radius: 5px;
            color: #fff;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        .login-container input[type="submit"]:hover {
            background-color: #0056b3;
        }
        .error {
            color: red;
            font-size: 12px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Login</h2>
        <form action="conn.php" method="POST">
            <div id="errorMessage" class="error"></div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username"  placeholder="type here"/>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password"  placeholder="type here"/>
            <input type="submit" value="Login">
        </form>
    </div>

    <script>
        // JavaScript for form validation
        document.getElementById('loginForm').addEventListener('submit', function(event) {
            event.preventDefault(); // Prevent form submission

            // Get input values
            const username = document.getElementById('username').value.trim();
            const password = document.getElementById('password').value.trim();
            const errorMessage = document.getElementById('errorMessage');

            // Validate inputs
            if (!username || !password) {
                errorMessage.textContent = 'Both fields are required.';
            } else {
                errorMessage.textContent = ''; // Clear error
                alert('Form submitted successfully!');
                // Uncomment the next line to allow submission
                // this.submit();
            }
        });
    </script>
</body>
</html>