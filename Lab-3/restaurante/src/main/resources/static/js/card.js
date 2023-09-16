const cards = document.querySelectorAll('.menu-card');

cards.forEach(card => {
    card.addEventListener('click', () => {
        card.classList.toggle('show');
    });
});
