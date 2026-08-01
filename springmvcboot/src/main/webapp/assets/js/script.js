document.addEventListener('DOMContentLoaded', function () {
  document.querySelectorAll('.action-card input[type="text"]').forEach(function (input) {
    input.addEventListener('focus', function () { input.closest('.action-card').classList.add('is-active'); });
    input.addEventListener('blur', function () { input.closest('.action-card').classList.remove('is-active'); });
  });
});
