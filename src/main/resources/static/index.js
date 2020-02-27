$(document).ready(function () {

    // load login form first into app-root div
    showLoginForm();
});

// show login form
function showLoginForm() {
    $("#app-root").load('/module/usermanagement/features/account-management/login-to-account-by-user/login-to-account-by-user.html');
}

// show desktop form
function showDesktopForm() {
    $("#app-root").load('desktop.html');
}


