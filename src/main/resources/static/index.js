$(document).ready(function () {
    showLoginForm();
});

// show login form
function showLoginForm() {
    $("#app-root").load('/modules/user-management/features/account-management/login-to-account-by-user/login-to-account-by-user.html');
}
